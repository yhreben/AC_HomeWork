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

        int minRowIndex = findMinRowIndex(matrix);

    }

    public static int findMinRowIndex(int[][] matrix) {

        int rowIndex = 0;
        int rowSum;
        int columnSum;

        for (int i = 0; i < matrix.length; i++) {
            rowSum = 0;
            columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }

            System.out.println("RowIndex = " + i + "; Summa = "  + rowSum);
            System.out.println("ColumnIndex = " + i + "; Summa = "  + columnSum);
        }
        return rowIndex;
    }

}