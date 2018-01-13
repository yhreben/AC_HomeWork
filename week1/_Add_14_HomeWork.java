package week1;

import java.util.Scanner;

/*
* Определить, является ли шестизначное число "счастливым" (сумма
* первых трех цифр равна сумме последних трех цифр).
* */
public class _Add_14_HomeWork {
    public static void main(String[] args){
        int enteredNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a six-digit number:");
        enteredNumber = sc.nextInt();
        int digit6 = enteredNumber%10;
        int digit5 = enteredNumber/10%10;
        int digit4 = enteredNumber/100%10;
        int digit3 = enteredNumber/1000%10;
        int digit2 = enteredNumber/10000%10;
        int digit1 = enteredNumber/100000%10;

        if(digit1 + digit2 + digit3 == digit4 + digit5 + digit6){
            System.out.println("Happy number");
        }else {
            System.out.println("Ordinary number");
        }
    }
}
