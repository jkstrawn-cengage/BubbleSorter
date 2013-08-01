import java.util.List;


public class StringBubbleSorter extends BubbleSorter {

	private List<String> array;

	public StringBubbleSorter(List<String> array) {
		this.array = array;
		this.length = array.size();		
	}
	
	@Override
	protected void swap(int first, int second) {
		String old = array.get(first);
		array.set(first, array.get(second));	
		array.set(second, old);		
	}

	@Override
	protected boolean outOfOrder(int first, int second) {
		return Integer.parseInt(array.get(first)) > 
		Integer.parseInt(array.get(second));
	}
}
