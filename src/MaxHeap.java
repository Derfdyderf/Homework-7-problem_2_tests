import java.util.Arrays;
import java.util.Collections;

public class MaxHeap implements Heap {
    int size;

    Integer[] data;

    public MaxHeap(int capacity) {
        data = new Integer[capacity];
        size = 0;
    }

    // build a heap based on data
    // to be implemented in O(nlogn)
    public void MaxHeapnLogN(Integer[] data) {
        Arrays.sort(data, Collections.reverseOrder());

        size = data.length;
    }

    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {
        size = data.length;

        for (int i = (size/2)-1; i >= 0; i--)
            heapifyUp(data, size, i);
    }

    // add an item to the heap
    public boolean add(Integer item) {
        size++;
        data[size-1] = item;
        heapifyUp(data, size, size-1);
        return true;
    }

    // return the max item in the heap
    public Integer get() {

        return data[0];
    }

    // remove the root item
    public Integer pop() {
        Integer pop = data[0];
        data[0] = data[size-1];
        size--;
        heapifyUp(data, size, 0);
        return pop;
    }

    public void swap(Integer[] data, int i,int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


    /*
    this was very much so influenced by the heapify method on GeeksForGeeks
     */
    public void heapifyUp(Integer[] data, int s, int val) {
        int bigBoy = val;
        int left = 2*val+1;
        int right = 2*val+2;

        if ((left < s) && (data[left] > data[bigBoy])) {
            bigBoy = left;
        }

        if ((right < s) && (data[right] > data[bigBoy])) {
            bigBoy = right;
        }

        if (!(bigBoy == val)) {
            swap(data, val, bigBoy);
            heapifyUp(data, s, bigBoy);
        }
    }
}
