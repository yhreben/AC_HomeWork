package week2;

import utils.ArrayUtils;

/*
 * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 * */

public class W2_4_4_HomeWork {
    public static void main(String[] args) {

        int sizeOfArray = 10;
        int[] array1 = ArrayUtils.generateArray(sizeOfArray);
        int[] array2 = ArrayUtils.generateArray(sizeOfArray);

        System.out.println("Array 1:");
        ArrayUtils.printArray(array1);

        System.out.println("Array 2:");
        ArrayUtils.printArray(array2);

        copyArray(array1, array2);
//        Такий варіант не підходить
//        array2 = array1;
//        array1[1] = 999;
        System.out.println("Array 2 after copying:");
        ArrayUtils.printArray(array2);
    }


    public static void copyArray(int[] parentArray, int[] childArray) {

        for (int i = 0; i < parentArray.length; i++) {
            childArray[i] = parentArray[i];
        }

    }
}
