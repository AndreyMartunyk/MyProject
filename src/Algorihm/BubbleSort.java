package Algorihm;

public class BubbleSort implements MySort{
    @Override
    public int[] sort(int[] array) {
        boolean sorted;
        for (int i = 0; i < array.length - 1; i++) {
            sorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return array;
    }
}
