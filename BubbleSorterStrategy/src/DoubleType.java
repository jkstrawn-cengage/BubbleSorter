import java.util.List;

public class DoubleType implements BaseType {
	private List<Double> array;
	
	public DoubleType(List<Double> array) {
		this.array = array;
	}
	
	public boolean outOfOrder(int first, int second) {
		return array.get(first) > array.get(second);
	}
	
	public void swap(int first, int second) {
		Double old = array.get(first);
		array.set(first, array.get(second));	
		array.set(second, old);
	}
	
	public int size() {
		return array.size();
	}
}
