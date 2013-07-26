import java.util.List;

public class StringType implements BaseType {
	private List<String> array;
	
	public StringType(List<String> array) {
		this.array = array;
	}
	
	public boolean outOfOrder(int first, int second) {
		return Integer.parseInt(array.get(first)) > 
		Integer.parseInt(array.get(second));
	}
	
	public void swap(int first, int second) {
		String old = array.get(first);
		array.set(first, array.get(second));	
		array.set(second, old);
	}
	
	public int size() {
		return array.size();
	}
}
