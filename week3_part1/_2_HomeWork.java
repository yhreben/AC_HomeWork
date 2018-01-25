package week3_part1;

/*Ввести предложение с консоли, найти самое короткое и самое длинное слово.
        Вывести найденные слова и их длину.*/

import java.util.Scanner;

public class _2_HomeWork {
    public static void main(String[] args) {

        System.out.println("Enter a sentence");

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] array = sentence.split(" ");

        findMinMaxLength(array);
    }

    private static void findMinMaxLength(String[] array) {

        String minLengthWord = array[0];
        String maxLengthWord = array[0];

        for (int i = 1; i < array.length; i++) {
            if(minLengthWord.length() > array[i].length()){

                minLengthWord = array[i];

            } else if (maxLengthWord.length() < array[i].length()){

                maxLengthWord = array[i];
            }

        }

        System.out.printf("minLengthWord = '%s' with length = %d;  maxLengthWord = '%s' with length = %d",
                minLengthWord, minLengthWord.length(), maxLengthWord, maxLengthWord.length());
    }
}

