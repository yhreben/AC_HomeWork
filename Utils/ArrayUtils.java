package Utils;

public class ArrayUtils {
    public static int[] generateArray(int size) {

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * size);
        }
        return array;
    }

    public static int[][] generateArray(int rows, int columns) {

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }

        }
        return matrix;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index = " + i + "; Value = " + array[i]);
        }
    }

    public static void printArray(String[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printArray(int [][] multiArray){
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.printf("%02d ", multiArray[i][j]);
            }
            System.out.println();

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
