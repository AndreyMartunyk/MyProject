package Algorihm;

public class MergeSort implements MySort{

    @Override
    public int[] sort (int[] array) {
        if (array.length < 2) {
            return array;
        }
       return merge(sort(leftHalfArr(array)), sort(rightHalfArr(array)));
       // sort(leftHalfArr(array));
        //sort(rightHalfArr(array));
        //return array;
    }

    private int[] merge (int[] leftHalf, int[] rightHalf) {
        int[] mergedArr = new int[leftHalf.length + rightHalf.length];
        for (int i = 0, j = 0, k = 0; k < mergedArr.length; k++) {
            if (i != leftHalf.length && j != rightHalf.length) {
                if (leftHalf[i] <= rightHalf[j]) {
                    mergedArr[k] = leftHalf[i];
                    i++;
                } else {
                    mergedArr[k] = rightHalf[j];
                    j++;
                }
            }
            else if (i == leftHalf.length) {
                mergedArr[k] = rightHalf[j];
                j++;
            }
            else {
                mergedArr[k] = leftHalf[i];
                i++;
            }
        }
        return mergedArr;
    }


    private int[] leftHalfArr (int[] array) {
        int[] newArr = new int[array.length / 2];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

    private int[] rightHalfArr(int[] array) {
        int[] newArr;
        if (array.length % 2 == 0) {
            newArr = new int[array.length / 2];
        } else {
            newArr = new int[(array.length / 2) + 1];
        }
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = array[i + (array.length / 2)];
        }
        return newArr;
    }


}
