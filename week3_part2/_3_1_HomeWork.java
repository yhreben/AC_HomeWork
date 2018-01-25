package week3_part2;

/*3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8*/

import utils.ArrayUtils;

public class _3_1_HomeWork {
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
                if (matrix[i][j] % divider == 0) {
                    matrix[i][j] = number;
                }
            }
        }

        System.out.println("Matrix after changes:");
        ArrayUtils.printArray(matrix);
    }


}
