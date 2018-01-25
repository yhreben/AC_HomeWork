package week2;

import java.util.Scanner;

/*
 * Проверить или является число простым
 * */

public class W2_7_2_HomeWork {
    public static void main(String[] args) {

        System.out.println("Enter some number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        isNumberPrime(num);

    }

    public static void isNumberPrime(int num) {

//        Просто́е число́  - натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя
//        - единицу и самого себя. Другими словами, число x является простым, если оно больше 1 и при этом делится
//        без остатка только на 1 и на x.

        int count = 0;

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                count += 1;
            }
        }

        if (count == 0) {
            System.out.println("Entered number is prime");
        } else {
            System.out.println("Entered number isn't prime");
        }
    }


}
