import org.junit.Test;

import static org.junit.Assert.*;

public class MaxHeapTest {
    @Test
    public void MaxHeapLogNT() {
        Integer[] input = {1,2,3,4,5,6,7,8,9};
        Integer[] expected = {9,8,7,6,5,4,3,2,1};
        MaxHeap check = new MaxHeap(10);
        check.MaxHeapnLogN(input);

        assertArrayEquals(expected,input);
    }

    @Test
    public void MaxHeapNT() {
        Integer[] input = {1,2,3,4,5,6,7,8,9};
        Integer[] expected = {9,8,7,4,5,6,3,2,1};
        MaxHeap check = new MaxHeap(10);
        check.MaxHeapN(input);

        assertArrayEquals(expected,input);
    }

    /**
     * get and pop are both tested in this method
     */
    @Test
    public void MaxHeapGetAndPopT() {
        Integer[] input = {1,2,3,4,5,6,7,8,9};
        MaxHeap check = new MaxHeap(10);
        check.MaxHeapnLogN(input);

        for (int i = 9; i <= 0; i--) {
            int get = check.get();
            int pop = check.pop();
            assertEquals(get, pop);
            assertEquals(i, pop);
        }
    }

    @Test
    public void MaxHeapAdd() {
        Integer[] input = {9,8,7,6,5,4,3,2,1};
        Integer[] expected = {9,8,7,6,5,4,3,2,1};

        MaxHeap check = new MaxHeap(10);
        for( int i = 0; i < input.length; i++) {
            check.add(input[i]);
        }

        assertArrayEquals(expected,input);
    }
}