package Utils;

public class ArrayUtils {
    public static int[] generateArray(int size) {

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * size);
        }
        return array;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index = " + i + "; Value = " + array[i]);
        }
    }

    public static int findAverageValueOfArray(int[] array) {

        int average;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        average = sum / array.length;

        return average;
    }

    public static int[] generateArrayWithRangeNumbers(int length, int rangeFrom, int rangeTill){
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(rangeTill - rangeFrom) + rangeFrom);
        }
        return array;
    }

}
