package week2;

import utils.ArrayUtils;

/*
 * Инвертировать массив (без использования допольнительного массива)
 * */

public class W2_7_1_HomeWork {
    public static void main(String[] args) {

        int sizeOfArray = 11;
        int[] array = ArrayUtils.generateArray(sizeOfArray);

        ArrayUtils.printArray(array);

        invertArray(array);

        ArrayUtils.printArray(array);
    }


    public static void invertArray(int[] array) {

        for (int i = 0; i < array.length/2; i++) {
            int arrayValue = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = arrayValue;
        }

    }


}
