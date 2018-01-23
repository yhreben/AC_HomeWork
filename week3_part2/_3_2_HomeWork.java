package week3_part2;

/*3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.*/

import Utils.ArrayUtils;

public class _3_2_HomeWork {
    public static void main(String[] args) {

        int divider = 5;
        int number = 8;
        int[][] matrix = ArrayUtils.generateArray(5, 5);

        System.out.println("Matrix before changes:");
        ArrayUtils.printArray(matrix);

        replaceNumber(divider, number, matrix);
    }

    public static void replaceNumber(int divider, int number, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                //что такое логическая матрица?
                }
            }
        }

        System.out.println("Matrix after changes:");
        ArrayUtils.printArray(matrix);
    }


}
