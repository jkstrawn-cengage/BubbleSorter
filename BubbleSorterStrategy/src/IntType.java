import java.util.List;

public class IntType implements BaseType{
	private List<Integer> array;
	
	public IntType(List<Integer> array) {
		this.array = array;
	}
	
	public boolean outOfOrder(int first, int second) {
		return array.get(first) > array.get(second);
	}

	public void swap(int first, int second) {
		int old = array.get(first);
		array.set(first, array.get(second));	
		array.set(second, old);
	}
	
	public int size() {
		return array.size();
	}
}
