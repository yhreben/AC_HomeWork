package week1;

import java.util.Scanner;

/*
* Дано трехзначное число. Определить: а) верно ли, что все его цифры
* одинаковые; б) есть ли среди его цифр одинаковые.
* */
public class _Add_3_HomeWork {
    public static void main(String[] args){
        int enteredNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three-digit number:");
        enteredNumber = sc.nextInt();
        int digit3 = enteredNumber%10;

        int digit2 = enteredNumber/10%10;

        int digit1 = enteredNumber/100%100;

        if(digit1 == digit2 & digit1 == digit3){
            System.out.println("All digits are equal.");
        }else if(digit1 == digit2 | digit1 == digit3 | digit2 == digit3) {
            System.out.println("Some digits are equal.");
        }else {
            System.out.println("All digits are different.");
        }
    }
}
