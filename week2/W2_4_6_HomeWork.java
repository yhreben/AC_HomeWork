package week2;

import Utils.ArrayUtils;

/*
 * Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 * */

public class W2_4_6_HomeWork {
    public static void main(String[] args) {

        int sizeOfArray = 11;
        int[] array = ArrayUtils.generateArray(sizeOfArray);

        ArrayUtils.printArray(array);

        printMaxAveragePartOfArray(array);

    }


    public static void printMaxAveragePartOfArray(int[] array) {

        int firstPartSum = 0;
        int secondPartSum = 0;

        int firstArrayLength = array.length/2;
        int secondArrayLength = array.length - firstArrayLength;

        int[] firstArray = new int[firstArrayLength];
        int[] secondArray = new int[secondArrayLength];

        for (int i = 0; i < array.length; i++) {
            if (i < firstArrayLength) {
                firstPartSum += array[i];
                firstArray[i] = array[i];

            } else {
                secondPartSum += array[i];
                secondArray[i - firstArrayLength] = array[i];
            }

        }
        double firstPartAverage = firstPartSum/firstArrayLength;
        double secondPartAverage = secondPartSum/secondArrayLength;

        if (firstPartAverage > secondPartAverage){
            ArrayUtils.printArray(firstArray);

        } else if (firstPartAverage < secondPartAverage){
            ArrayUtils.printArray(secondArray);
        } else {
            System.out.println("Average of both part of array is equal");
        }

    }
}
