package week2;

import utils.ArrayUtils;

/*
 * Написать метод, который будет обрезать массив по границам start и end
 * */

public class W2_4_10_HomeWork {
    public static void main(String[] args) {

        int sizeOfArray = 20;

        int[] array = ArrayUtils.generateArray(sizeOfArray);
        ArrayUtils.printArray(array);

        int[] splittedArray = splitArray(array, 5, 10);
        ArrayUtils.printArray(splittedArray);

    }


    public static int[] splitArray(int[] arr, int start, int end) {

        int outputArrayLength = end + 1 - start;

        int[] newArray = new int[outputArrayLength];

        for (int i = start; i <= end; i++) {

            newArray[i - start] = arr[i];
        }
        return newArray;
    }
}
