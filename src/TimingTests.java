import java.util.concurrent.TimeUnit;


public class TimingTests {

    private static int factor = 50;
    private static int testSize = 100000 * factor;

    public static void main(String[] args) {
        Integer[] data = new Integer[testSize];

        for (int i = 0; i < testSize; i++) {
            data[i] = i;
        }


        MaxHeapLogN(data);
        MaxHeapN(data);



    }

    public static void MaxHeapLogN(Integer[] data) {
        MaxHeap check = new MaxHeap(testSize);

        long startTime = System.nanoTime();

        check.MaxHeapnLogN(data);

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("sorted heap O(nLogn) : " + durationInMillis);
    }

    public static void MaxHeapN(Integer[] data) {
        MaxHeap check = new MaxHeap(testSize);


        long startTime = System.nanoTime();

        check.MaxHeapN(data);

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("sorted heap O(n) : " + durationInMillis);
    }
}
