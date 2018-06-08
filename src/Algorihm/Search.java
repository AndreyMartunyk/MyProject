package Algorihm;

public class Search {
    //возвращает номер индекса найденого элемента
    //в случае не найденого элемента или пустого массива возвращает -1

    // линейный поиск
    public int linearSearch (int[] array, int key) {
        if (array.length < 1) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //бинарный поиск
    public int binarySearch (int[] array, int key) {
        if (array.length < 1) {
            return -1;
        }
        int start = 0, end = array.length, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int linearCountOf (int[] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                count++;
            }
        }
        return count;
    }

    public int binaryCountOf (int[] array, int key) {
        int count = 0;
        int firstEntry = binarySearch(array, key);
        for (int i = firstEntry; i > 0 ; i--) {
            if (key == array[i - 1]) {
                firstEntry--;
            }
            else {
                break;
            }
        }
        for (int i = firstEntry; i < array.length; i++) {
            if (key == array[i]) {
                count++;
            }
        }
        return count;
    }












}
