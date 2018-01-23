package week3_part2;

/*Матрицы генерировать случайными числами и размер матрицы вводит юзер.*/

import Utils.ArrayUtils;

import java.util.Scanner;

public class _3_HomeWork {
    public static void main(String[] args) {

        System.out.println("Enter count of rows");

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Enter count of columns");

        int columns = sc.nextInt();

        int[][] matrix = ArrayUtils.generateArray(rows, columns);
        ArrayUtils.printArray(matrix);
    }
}
