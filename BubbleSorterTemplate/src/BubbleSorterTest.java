import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class BubbleSorterTest {

	@Test
	public void sort_two_numbers() {
		List<Integer> array = 		Arrays.asList(2, 1);
		List<Integer> arraySorted = Arrays.asList(1, 2);
		IntBubbleSorter bubble = new IntBubbleSorter(array);
		bubble.sort();
		assertEquals(arraySorted, array);
	}
	@Test
	public void sort_three_out_of_order() {
		List<Integer> array = 		Arrays.asList(3, 2, 1);
		List<Integer> arraySorted = Arrays.asList(1, 2, 3);
		IntBubbleSorter bubble = new IntBubbleSorter(array);
		bubble.sort();
		assertEquals(arraySorted, array);
	}
	
	// DOUBLE

	@Test
	public void sort_two_doubles() {
		List<Double> array = 		Arrays.asList(1.8, 1.1);
		List<Double> arraySorted = 	Arrays.asList(1.1, 1.8);
		DoubleBubbleSorter bubble = new DoubleBubbleSorter(array);
		bubble.sort();
		assertEquals(arraySorted, array);
	}
	
	@Test
	public void sort_three_out_of_order_doubles() {
		List<Double> array = 		Arrays.asList(1.9, 1.6, 1.2);
		List<Double> arraySorted = Arrays.asList(1.2, 1.6, 1.9);
		DoubleBubbleSorter bubble = new DoubleBubbleSorter(array);
		bubble.sort();
		assertEquals(arraySorted, array);
	}
	
	//STRING

	@Test
	public void sort_two_strings() {
		List<String> array = 		Arrays.asList("2", "1");
		List<String> arraySorted = 	Arrays.asList("1", "2");
		StringBubbleSorter bubble = new StringBubbleSorter(array);
		bubble.sort();
		assertEquals(arraySorted, array);
	}
	
	@Test
	public void sort_three_out_of_order_strings() {
		List<String> array = 		Arrays.asList("33", "22", "11");
		List<String> arraySorted = Arrays.asList("11", "22", "33");
		StringBubbleSorter bubble = new StringBubbleSorter(array);
		bubble.sort();
		assertEquals(arraySorted, array);
	}
}
