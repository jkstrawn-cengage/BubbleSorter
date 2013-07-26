public abstract class BubbleSorter {
	protected int length;
	
	public void sort() {
		for(int i = 0; i < length - 1; i++) {			
			for(int k = 0; k < length - 1; k++) {
				int first = k;
				int second = k + 1;
				if (outOfOrder(first, second)) {					
					swap(first, second);	
				}
			}
		}
	}

	protected abstract void swap(int first, int second);
	protected abstract boolean outOfOrder(int first, int second);
}