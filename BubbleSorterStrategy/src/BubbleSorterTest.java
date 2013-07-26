import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class BubbleSorterTest {

	@Test
	public void sort_two_numbers() {
		List<Integer> array = 			Arrays.asList(2, 1);
		List<Integer> sortedArray = 	Arrays.asList(1, 2);
		BubbleSorter bubble = new BubbleSorter(new IntType(array));
		bubble.sort();
		assertEquals(sortedArray, array);
	}

	@Test
	public void sort_three_numbers() {
		List<Integer> array = 			Arrays.asList(3, 2, 1);
		List<Integer> sortedArray = 	Arrays.asList(1, 2, 3);
		BubbleSorter bubble = new BubbleSorter(new IntType(array));
		bubble.sort();
		assertEquals(sortedArray, array);
	}
	
	@Test
	public void sort_two_double() {
		List<Double> array = 		Arrays.asList(1.9, 1.2);
		List<Double> sortedArray = 	Arrays.asList(1.2, 1.9);
		BubbleSorter bubble = new BubbleSorter(new DoubleType(array));
		bubble.sort();
		assertEquals(sortedArray, array);
	}
	
	@Test
	public void sort_three_double() {
		List<Double> array = 		Arrays.asList(2.3, 1.5, 1.1);
		List<Double> sortedArray = 	Arrays.asList(1.1, 1.5, 2.3);
		BubbleSorter bubble = new BubbleSorter(new DoubleType(array));
		bubble.sort();
		assertEquals(sortedArray, array);
	}
	
	@Test
	public void sort_two_strings() {
		List<String> array = 		Arrays.asList("22", "11");
		List<String> sortedArray = 	Arrays.asList("11", "22");
		BubbleSorter bubble = new BubbleSorter(new StringType(array));
		bubble.sort();
		assertEquals(sortedArray, array);
	}
	
	@Test
	public void sort_three_strings() {
		List<String> array = 		Arrays.asList("33", "22", "11");
		List<String> sortedArray = 	Arrays.asList("11", "22", "33");
		BubbleSorter bubble = new BubbleSorter(new StringType(array));
		bubble.sort();
		assertEquals(sortedArray, array);
	}
	/*
	@Test
	public void sort_two_of_three() {
		List<Integer> array = 		Arrays.asList(1, 3, 2);
		List<Integer> sortedArray = Arrays.asList(1, 2, 3);
		assertEquals(sortedArray, bubble.sortInts(array));
	}
	
	@Test
	public void sort_three_out_of_order() {
		List<Integer> array = 		Arrays.asList(3, 2, 1);
		List<Integer> sortedArray = Arrays.asList(1, 2, 3);
		assertEquals(sortedArray, bubble.sortInts(array));
	}
	
	// DOUBLE
	@Test
	public void sort_same_double() {
		List<Double> array = 		Arrays.asList(1.4, 1.7);
		assertEquals(array, bubble.sortDoubles(array));
	}

	@Test
	public void sort_two_doubles() {
		List<Double> array = 		Arrays.asList(1.8, 1.1);
		List<Double> arraySorted = 	Arrays.asList(1.1, 1.8);
		assertEquals(arraySorted, bubble.sortDoubles(arraySorted));
	}

	@Test
	public void sort_two_of_three_doubles() {
		List<Double> array = 		Arrays.asList(1.5, 2.5, 1.9);
		List<Double> sortedArray = Arrays.asList(1.5, 1.9, 2.5);
		assertEquals(sortedArray, bubble.sortDoubles(array));
	}
	
	@Test
	public void sort_three_out_of_order_doubles() {
		List<Double> array = 		Arrays.asList(1.9, 1.6, 1.2);
		List<Double> sortedArray = Arrays.asList(1.2, 1.6, 1.9);
		assertEquals(sortedArray, bubble.sortDoubles(array));
	}
	
	//STRING

	@Test
	public void sort_same_strings() {
		List<String> array = 		Arrays.asList("1", "2");
		assertEquals(array, bubble.sortStrings(array));
	}
	@Test
	public void sort_two_strings() {
		List<String> array = 		Arrays.asList("2", "1");
		List<String> arraySorted = 	Arrays.asList("1", "2");
		assertEquals(arraySorted, bubble.sortStrings(arraySorted));
	}

	@Test
	public void sort_two_of_three_strings() {
		List<String> array = 		Arrays.asList("11", "33", "22");
		List<String> sortedArray = Arrays.asList("11", "22", "33");
		assertEquals(sortedArray, bubble.sortStrings(array));
	}
	
	@Test
	public void sort_three_out_of_order_strings() {
		List<String> array = 		Arrays.asList("33", "22", "11");
		List<String> sortedArray = Arrays.asList("11", "22", "33");
		assertEquals(sortedArray, bubble.sortStrings(array));
	}
	 */

}