package week3_part2;

/*
3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
	 b) Поменять наибольший и наименьший столбик в двухмерном массиве.
*/

import utils.ArrayUtils;

import java.util.Scanner;
// Еще в работе...
public class _3_5_HomeWork {
    public static void main(String[] args) {

        System.out.println("Enter count of rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Enter count of columns");

        int columns = sc.nextInt();

        int[][] matrix = ArrayUtils.generateArray(rows, columns);

        System.out.println("Our matrix:");
        ArrayUtils.printArray(matrix);

        //int minRowIndex = findMinRowIndex(matrix);
        findMinRowIndex(matrix);

        ArrayUtils.printArray(matrix);

    }

    public static void findMinRowIndex(int[][] matrix) {

        int minRowIndex = 0;
        int maxRowIndex = 0;
        int rowSum;
        int minRowSum = 0;
        int maxRowSum = 0;
//        Create array to get sum of columns
        int [] array = new int[matrix.length];
//        int columnSum;

        for (int i = 0; i < matrix.length; i++) {
            rowSum = 0;
//            columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
//                In this array we'll have sum of matrix columns
                array [j] += matrix[i][j];
//                columnSum += matrix[j][i];
            }
//                Save min and max row sum
            if (i == 0) {
                minRowSum = rowSum;
                maxRowSum = rowSum;
            }
//            Find min row index
            if (minRowSum > rowSum){
                minRowSum = rowSum;
                minRowIndex = i;
            }
//            Find max row index
            if (maxRowSum < rowSum){
                maxRowSum = rowSum;
                maxRowIndex = i;
            }

            System.out.println("RowIndex = " + i + "; Summa = "  + rowSum);
//            System.out.println("ColumnIndex = " + i + "; Summa = "  + columnSum);
        }
        ArrayUtils.printArray(array);
        System.out.println("minRowIndex = " + minRowIndex + "; minRowSum = " + minRowSum);
        System.out.println("maxRowIndex = " + maxRowIndex + "; msxRowSum = " + maxRowSum);

        replaceRowsInMatrix(matrix, minRowIndex, maxRowIndex);
        //replaceColumnsInMatrix(matrix, 0, 4);
    }

    public static void replaceRowsInMatrix(int[][] matrix, int minRowIndex, int maxRowIndex) {

        int[] minIndexArray = matrix[minRowIndex];

        matrix[minRowIndex] = matrix[maxRowIndex];
        matrix[maxRowIndex] = minIndexArray;

    }

    public static void replaceColumnsInMatrix(int[][] matrix, int minColumnIndex, int maxColumnIndex) {

        int columnValue;
        for (int i = 0; i < matrix.length; i++) {

            columnValue = matrix[i][minColumnIndex];
            matrix[i][minColumnIndex] = matrix[i][maxColumnIndex];
            matrix[i][maxColumnIndex] = columnValue;
            }

        }


}