package week2;

import utils.ArrayUtils;

/*
 * Найти минимальное и максимальное значения в массиве и вывести их на консоль
 * */

public class W2_4_1_HomeWork {
    public static void main(String[] args) {

        int sizeOfArray = 100;
        int[] array = ArrayUtils.generateArray(sizeOfArray);

        ArrayUtils.printArray(array);

        findMinMaxValueOfArray(array);
    }


    public static void findMinMaxValueOfArray(int[] array) {

        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("MinValue = " + minValue + "; MaxValue = " + maxValue);
    }
}
