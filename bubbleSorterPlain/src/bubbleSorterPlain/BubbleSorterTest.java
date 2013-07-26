package bubbleSorterPlain;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class BubbleSorterTest {
	Bubble bubble = new Bubble();
	
	@Test
	public void sort_same_array() {
		List<Integer> array = 		Arrays.asList(1, 2);
		assertEquals(array, bubble.sortArray(array));
	}

	@Test
	public void sort_two_numbers() {
		List<Integer> array = 		Arrays.asList(2, 1);
		List<Integer> sortedArray = Arrays.asList(1, 2);
		assertEquals(sortedArray, bubble.sortArray(array));
	}
	
	@Test
	public void sort_two_of_three() {
		List<Integer> array = 		Arrays.asList(1, 3, 2);
		List<Integer> sortedArray = Arrays.asList(1, 2, 3);
		assertEquals(sortedArray, bubble.sortArray(array));
	}
	
	@Test
	public void sort_three_out_of_order() {
		List<Integer> array = 		Arrays.asList(3, 2, 1);
		List<Integer> sortedArray = Arrays.asList(1, 2, 3);
		assertEquals(sortedArray, bubble.sortArray(array));
	}
}
