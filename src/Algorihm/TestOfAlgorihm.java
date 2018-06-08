package Algorihm;

import java.util.Arrays;

public class TestOfAlgorihm {
    public static void main(String[] args) {
        RandomIntArray myArray = new RandomIntArray(10000);
        int[] testArray = myArray.create();

        long start, finish;

        start = System.currentTimeMillis();
        MergeSort ms = new MergeSort();
        int[] mergeArr = ms.sort(testArray);
        System.out.println(Arrays.toString(mergeArr));
        finish = System.currentTimeMillis();
        System.out.println("MergeSort: " + (finish - start));
   start = System.currentTimeMillis();

        BubbleSort bs = new BubbleSort();
        int[] bubbleArr = bs.sort(testArray);
        System.out.println(Arrays.toString(bubbleArr));
        finish = System.currentTimeMillis();
        System.out.println("BubbleSort: " + (finish - start));

        Search search = new Search();
        System.out.println("binarySearch: " + search.binarySearch(mergeArr, 55));
        System.out.println("linearSearch: " + search.linearSearch(mergeArr, 55));

        System.out.println();

        start = System.currentTimeMillis();
        System.out.println("Count of 5 (linear search): " + search.linearCountOf(mergeArr, 90));
        finish = System.currentTimeMillis();
        System.out.println("Time (linear search): " + (finish - start));

        start = System.currentTimeMillis();
        System.out.println("Count of 5 (binary search): " + search.binaryCountOf(mergeArr, 90));
        finish = System.currentTimeMillis();
        System.out.println("Time (binary search): " + (finish - start));

    }

}
