package week2;

import Utils.ArrayUtils;

import java.util.Scanner;

/*
 * Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве
 * */

public class W2_4_5_HomeWork {
    public static void main(String[] args) {

        System.out.println("Enter some number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sizeOfArray = 100;
        int[] array = ArrayUtils.generateArray(sizeOfArray);

        ArrayUtils.printArray(array);

        int numCount =  findEnteredNumberCount(array, num);

        System.out.println("Entered number " + num + " was founded " + numCount + " times.");
    }


    public static int findEnteredNumberCount(int[] array, int number) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count += 1;
            }
        }
        return count;
    }
}
