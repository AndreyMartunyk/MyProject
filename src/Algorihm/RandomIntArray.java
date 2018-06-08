package Algorihm;

public class RandomIntArray {
    private int[] array;

    public RandomIntArray(int count) {
        array = new int[count];
    }

    public int[] create () {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
