package week2;

import java.util.Scanner;

/*
 * Игра "Угадай число":
           Програма генерирует случайное, целое число в диапазоне от 25 до 125 (включительно).
           Пользователь пытается его угадать.
           Число попыток ограничено 5.
           Если пользователь ввел неверное число, программа дает подсказу (больше/меньше).
           Придумать разные варианты ответов, при отгадывании с первой попытки, нескольких попыток, в случае проигрыша.
 * */

public class W2_6_HomeWork {
    public static void main(String[] args) {

        int randomNumber = generateRandomNumber(25, 125);

        System.out.println(randomNumber);

        guessNumber(randomNumber, 5);

    }

    public static void guessNumber(int randomNumber, int attempts) {

        for (int i = 1; i <=attempts ; i++) {

        System.out.println("Try to guess the number. You have attempts: " + (attempts +1 - i) + "; Enter numbe:");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();

        if(enteredNumber == randomNumber){

            System.out.println("Congratulations. You won. Number = " + randomNumber);
            return;

        } else if(enteredNumber > randomNumber){

            System.out.println("The guessed number is less than the entered number");

        } else {

            System.out.println("The guessed number is greater than the number entered");
        }

        }
        System.out.println("You lose");
    }


    public static int generateRandomNumber(int rangeFrom, int rangeTill) {

        int number = (int)(Math.random()*(rangeTill - rangeFrom) + rangeFrom);

        return number;
    }
}
