package week1;

import java.util.Scanner;

/*
* Вычислить факториал числа.
* */
public class _Extra_2_HomeWork {
    public static void main(String[] args){
        int enteredNumber;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        enteredNumber = sc.nextInt();

        for(int i = 1; i <= enteredNumber; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial = " + factorial);
    }
}
