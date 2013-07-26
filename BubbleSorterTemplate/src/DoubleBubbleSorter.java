import java.util.List;

public class DoubleBubbleSorter extends BubbleSorter {

	private List<Double> array;
		
	public DoubleBubbleSorter(List<Double> array) {
		this.array = array;
		this.length = array.size();
	}

	@Override
	protected void swap(int first, int second) {
		Double old = array.get(first);
		array.set(first, array.get(second));	
		array.set(second, old);		
	}

	@Override
	protected boolean outOfOrder(int first, int second) {
		return array.get(first) > array.get(second);
	}
}