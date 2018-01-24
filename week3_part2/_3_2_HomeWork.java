package week3_part2;

/*3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.*/

import Utils.ArrayUtils;

public class _3_2_HomeWork {
    public static void main(String[] args) {

        boolean[][] matrix = ArrayUtils.generateBooleanArray(5, 5);

        System.out.println("Our matrix:");
        ArrayUtils.printArray(matrix);

        System.out.println("Changed array:");
        changeElement(matrix);
    }

    public static void changeElement(boolean [][] multiArray){
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {

                if(i == j) {
                    multiArray[i][j] = true;
                }
                String delimiter = multiArray[i][j] ? "  " : " ";
                System.out.printf("%b" + delimiter, multiArray[i][j]);
            }
            System.out.println();
        }
    }
}
