package week3_part1;

/*Напишите метод, заменяющий в строке все вхождения слова «бяка»
на «вырезано цензурой»(не используя метод replaceAll()).*/

import java.util.Scanner;

public class _3_HomeWork {
    public static void main(String[] args) {

        System.out.println("Enter a sentence");

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        String wordToSearch = "бяка";
        String textForReplace = "вырезано цензурой";

        replace(inputText, wordToSearch, textForReplace);
    }

    public static void replace(String text, String wordToFind, String replacementText) {

        String[] array = text.split(" ");
        String outputText = "";

        for (int i = 0; i < array.length; i++) {

            if(wordToFind.equals(array[i])){
                array[i] = replacementText;
            }
            outputText += array[i] + " ";
        }
        System.out.println(outputText);
    }

}
