package week2;

import utils.ArrayUtils;

/*
 * Найти среднее арифметическое массива
 * */

public class W2_4_2_HomeWork {
    public static void main(String[] args) {

        int sizeOfArray = 100;
        int[] array = ArrayUtils.generateArray(sizeOfArray);

        ArrayUtils.printArray(array);

        findAverageValueOfArray(array);
    }


    public static void findAverageValueOfArray(int[] array) {

        int average;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        System.out.println("Sum of all array elements = " + sum);
        System.out.println("Array length = " + array.length);
        System.out.println("Average = " + average);
    }
}
