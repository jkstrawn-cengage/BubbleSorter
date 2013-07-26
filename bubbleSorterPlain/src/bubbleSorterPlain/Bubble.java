package bubbleSorterPlain;
import java.util.List;

public class Bubble {

	public List<Integer> sortArray(List<Integer> array) {
		for(int i = 0; i < array.size() - 1; i++) {			
			for(int k = 0; k < array.size() - 1; k++) {
				int first = k;
				int second = k + 1;
				if (outOfOrder(array, first, second)) {					
					swap(array, first, second);	
				}
			}
		}
		return array;
	}

	private boolean outOfOrder(List<Integer> array, int first, int second) {
		return array.get(first) > array.get(second);
	}

	private void swap(List<Integer> array, int first, int second) {
		int old = array.get(first);
		array.set(first, array.get(second));	
		array.set(second, old);
	}
}
