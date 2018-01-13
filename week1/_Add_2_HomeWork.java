package week1;

import java.util.Scanner;

/*
* Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
* тельные заменить на 0.
* */
public class _Add_2_HomeWork {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        a = sc.nextInt();
        if(a > 0){
            a = (int)Math.pow(a,3);
            System.out.println("Positive number. Result: " + a);
        }else if(a == 0) {
            System.out.println("Zero number");
        }else {
            a = 0;
            System.out.println("Negative number. Result: " + a);
        }

        System.out.println("Enter second number:");
        a = sc.nextInt();
        if(a > 0){
            a = (int)Math.pow(a,3);
            System.out.println("Positive number. Result: " + a);
        }else if(a == 0) {
            System.out.println("Zero number");
        }else {
            a = 0;
            System.out.println("Negative number. Result: " + a);
        }

        System.out.println("Enter third number:");
        a = sc.nextInt();

        if(a > 0){
            a = (int)Math.pow(a,3);
            System.out.println("Positive number. Result: " + a);
        }else if(a == 0) {
            System.out.println("Zero number");
        }else {
            a = 0;
            System.out.println("Negative number. Result: " + a);
        }

    }
}
