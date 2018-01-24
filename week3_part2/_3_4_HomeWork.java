package week3_part2;

/*
3.4. Создать массив, который будет состоять из диагонали матрици
		1 3 5
		4 5 7  -  1 5 6
		4 5 6
*/

import Utils.ArrayUtils;

public class _3_4_HomeWork {
    public static void main(String[] args) {

        int[][] matrix = ArrayUtils.generateArray(5, 5);

        System.out.println("Our matrix:");
        ArrayUtils.printArray(matrix);

        int[] array = getArrayFromDiagonal(matrix);
        System.out.println("Created array:");
        ArrayUtils.printArray(array);
    }

    public static int[] getArrayFromDiagonal(int[][] matrix) {

        int[] array = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j) {
                    array[i] = matrix[i][j];
                }
            }
        }

        return array;
    }


}