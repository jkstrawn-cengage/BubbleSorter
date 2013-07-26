import java.util.List;

public class IntBubbleSorter extends BubbleSorter{
	private List<Integer> array;

	public IntBubbleSorter(List<Integer> array) {
		this.array = array;
		this.length = array.size();
	}
	
	@Override
	protected void swap(int first, int second) {
		int old = array.get(first);
		array.set(first, array.get(second));	
		array.set(second, old);
	}

	@Override
	protected boolean outOfOrder(int first, int second) {
		return array.get(first) > array.get(second);
	}
}