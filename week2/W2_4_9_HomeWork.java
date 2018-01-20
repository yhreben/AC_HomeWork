package week2;

import Utils.ArrayUtils;

/*
 * Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 * */

public class W2_4_9_HomeWork {
    public static void main(String[] args) {

        int sizeOfArray = 10;

        int[] firstArray = generateArrayWithRangeNumbers(sizeOfArray,25, 75);
        int[] secondArray = generateArrayWithRangeNumbers(sizeOfArray,25, 75);

        ArrayUtils.printArray(firstArray);
        ArrayUtils.printArray(secondArray);

        int evenNumsCountOfArray1 = findCountOfEvenNumbers(firstArray);
        int evenNumsCountOfArray2 = findCountOfEvenNumbers(secondArray);

        System.out.println("evenNumsCountOfArray1 = " + evenNumsCountOfArray1);
        System.out.println("evenNumsCountOfArray2 = " + evenNumsCountOfArray2);

    }

    public static int findCountOfEvenNumbers(int[] array){
        int evenNumbersCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evenNumbersCount += 1;
            }
        }

        return evenNumbersCount;
    }

    public static int[] generateArrayWithRangeNumbers(int length, int rangeFrom, int rangeTill){
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(rangeTill - rangeFrom) + rangeFrom);
        }
        return array;
    }


}
