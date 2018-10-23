package test.java;

import static org.junit.Assert.*;


import main.java.Item;
import main.java.SortAlgos;

import org.junit.Test;


public class AlgoTest {
	
	// Node coverage
	@Test (expected=NullPointerException.class)
	public void testWithNullBubbleSort() throws Exception {
        Item [] array = null;
        SortAlgos.bubbleSort(array);
        assertNull(array);
	}
	
	@Test (expected=NullPointerException.class)
	public void testWithNullForSelectionSort() throws Exception {
		Item [] array = null;
        SortAlgos.selectionSort(array);
        assertNull(array);
	}
	
	@Test (expected=NullPointerException.class)
	public void testWithNullForInserationSort() throws Exception {
		Item [] array2 = null;
        SortAlgos.insertionSort(array2);
        assertNull(array2);
	}
	
	@Test (expected=NullPointerException.class)
	public void testWithNullForMergeSort() throws Exception {
		Item [] array = null;
        SortAlgos.mergeSort(array);
        assertNull(array);
	}
	
	@Test (expected=NullPointerException.class)
	public void testWithNullForQuickSort() throws Exception {
		Item [] array = null;
        SortAlgos.quickSort(array);
        assertNull(array);
	}
	
	@Test (expected=NullPointerException.class)
	public void testWithNullForHeapSort() throws Exception {
		Item [] array = null;
        SortAlgos.heapSort(array);
        assertNull(array);
	} 
	
	
	
	// Node & conditional Coverage
	@Test
	public void testDescendingOrderForBubbleSort() throws Exception {
        Item [] array = new Item[3];
        array[0] = new Item(12);
        array[1] = new Item(11);
        array[2] = new Item(10);
        SortAlgos.bubbleSort(array);
        
        assertTrue(array[0].key == 10);
        assertTrue(array[1].key == 11);
        assertTrue(array[2].key == 12);
	}
	
	@Test
	public void testDescendingOrderForSelectionSort() throws Exception {
        Item [] array = new Item[3];
        array[0] = new Item(12);
        array[1] = new Item(11);
        array[2] = new Item(10);
        SortAlgos.selectionSort(array);
        
        assertTrue(array[0].key == 10);
        assertTrue(array[1].key == 11);
        assertTrue(array[2].key == 12);
	}
	
	@Test
	public void testDescendingOrderForInsertionSort() throws Exception {
        Item [] array = new Item[3];
        array[0] = new Item(12);
        array[1] = new Item(11);
        array[2] = new Item(10);
        SortAlgos.insertionSort(array);
        
        assertTrue(array[0].key == 10);
        assertTrue(array[1].key == 11);
        assertTrue(array[2].key == 12);
	}
	
	// Node Coverage
	@Test
	public void testOneElementForBubbleSort() throws Exception {
        Item [] array = new Item[1];
        array[0] = new Item(10);
        SortAlgos.bubbleSort(array);
        assertTrue(array[0].key == 10);

	}

	@Test
	public void testOneElementForSelectionSort() throws Exception {
        Item [] array = new Item[1];
        array[0] = new Item(10);
        SortAlgos.selectionSort(array);
        assertTrue(array[0].key == 10);

	}
	
	@Test
	public void testOneElementForInsertionSort() throws Exception {
        Item [] array = new Item[1];
        array[0] = new Item(10);
        SortAlgos.insertionSort(array);
        assertTrue(array[0].key == 10);

	}
	
	@Test
	public void testOneElementForMergeSort() throws Exception {
        Item [] array = new Item[1];
        array[0] = new Item(10);
        SortAlgos.mergeSort(array);
        assertTrue(array[0].key == 10);

	}
	
	@Test
	public void testOneElementForQuickSort() throws Exception {
        Item [] array = new Item[1];
        array[0] = new Item(10);
        SortAlgos.quickSort(array);
        assertTrue(array[0].key == 10);

	}
	
	@Test
	public void testOneElementForHeapSort() throws Exception {
        Item [] array = new Item[1];
        array[0] = new Item(10);
        SortAlgos.heapSort(array);
        assertTrue(array[0].key == 10);

	}
	
	// Edge & conditional Coverage
	
	@Test
	public void testWithMixedForBubbleSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(10);
        array[1] = new Item(2);
        array[2] = new Item(15);
        array[3] = new Item(3);
        SortAlgos.bubbleSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}

	@Test
	public void testWithMixedForSelectionSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(10);
        array[1] = new Item(2);
        array[2] = new Item(15);
        array[3] = new Item(3);
        SortAlgos.selectionSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithMixedForInsertionSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(10);
        array[1] = new Item(2);
        array[2] = new Item(15);
        array[3] = new Item(3);
        SortAlgos.insertionSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithMixedForMergeSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(10);
        array[1] = new Item(2);
        array[2] = new Item(15);
        array[3] = new Item(3);
        SortAlgos.mergeSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithMixedForQuickSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(10);
        array[1] = new Item(2);
        array[2] = new Item(15);
        array[3] = new Item(3);
        SortAlgos.quickSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithMixedForHeapSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(10);
        array[1] = new Item(2);
        array[2] = new Item(15);
        array[3] = new Item(3);
        SortAlgos.heapSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}

	// Node & conditional Coverage
	@Test
	public void testWithSortedArrayForBubbleSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(2);
        array[1] = new Item(3);
        array[2] = new Item(10);
        array[3] = new Item(15);
        SortAlgos.bubbleSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithSortedArrayForSelectionSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(2);
        array[1] = new Item(3);
        array[2] = new Item(10);
        array[3] = new Item(15);
        SortAlgos.selectionSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithSortedArrayForInsertionSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(2);
        array[1] = new Item(3);
        array[2] = new Item(10);
        array[3] = new Item(15);
        SortAlgos.insertionSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithSortedArrayForMergeSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(2);
        array[1] = new Item(3);
        array[2] = new Item(10);
        array[3] = new Item(15);
        SortAlgos.mergeSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithSortedArrayForQuickSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(2);
        array[1] = new Item(3);
        array[2] = new Item(10);
        array[3] = new Item(15);
        SortAlgos.quickSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	
	@Test
	public void testWithSortedArrayForHeapSort() throws Exception {
        Item [] array = new Item[4];
        array[0] = new Item(2);
        array[1] = new Item(3);
        array[2] = new Item(10);
        array[3] = new Item(15);
        SortAlgos.heapSort(array);
        
        assertTrue(array[0].key == 2);
        assertTrue(array[1].key == 3);
        assertTrue(array[2].key == 10);
        assertTrue(array[3].key == 15);

	}
	

}
