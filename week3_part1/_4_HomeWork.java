package week3_part1;

/*
Верхний регистр.

   		Напишите программу, которая позволяет пользователю ввести в консоли строку,
   		переводит первый символ слов в верхний регистр и результат выводит в консоль

   		Вход:
   		иван васильевич

   		Выход:
   		Иван Васильевич
*/

import Utils.ArrayUtils;

import java.util.Scanner;

public class _4_HomeWork {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String sentence = sc.nextLine();

        String sentence = "иван васильевич меняет профессию";

        System.out.println(sentence);

        String[] array = sentence.split(" ");

        firstLetterToUpperCase(array);
    }

    public static void firstLetterToUpperCase(String[] array) {

        String newSentence = "";

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);

            newSentence += array[i] + " ";
        }

        System.out.println(newSentence);
    }
}
