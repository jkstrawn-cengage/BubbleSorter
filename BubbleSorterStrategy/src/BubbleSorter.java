public class BubbleSorter {
	
	private BaseType type;
	
	public BubbleSorter(BaseType type) {
		this.type = type;
	}
	
	public void sort() {
		for(int i = 0; i < type.size() - 1; i++) {			
			for(int k = 0; k < type.size() - 1; k++) {
				int first = k;
				int second = k + 1;
				if (type.outOfOrder(first, second)) {					
					type.swap(first, second);	
				}
			}
		}
	}
}