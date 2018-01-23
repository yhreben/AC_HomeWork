package week3_part2;

import java.util.Scanner;

public class _3_11_HomeWork {
    public static void main(String[] args){
        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(getFactorial(number));
    }

    public static int getFactorial(int number) {

        if(number == 1){
            return 1;
        }

        return number * getFactorial(number - 1);
    }
}
