package week1;

import java.util.Scanner;

/*
* Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
* времени года. Если пользователь введет недопустимое число, программа
* должна выдать сообщение об ошибке.
* */
public class _Add_7_HomeWork {
    public static void main(String[] args){
        int enteredNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number from 1 to 12");
        enteredNumber = sc.nextInt();

        if(enteredNumber < 1 | enteredNumber > 12){
            System.out.println("Error: Incorrect number!");
        }else if(enteredNumber >= 3 & enteredNumber <= 5) {
            System.out.println("Spring");
        }else if(enteredNumber >= 6 & enteredNumber <= 8) {
            System.out.println("Summer");
        }else if(enteredNumber >= 9 & enteredNumber <= 11) {
            System.out.println("Autumn");
        }else {
            System.out.println("Winter");
        }
    }
}
