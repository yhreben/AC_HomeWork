package week1;

import java.util.Scanner;

/*
 * Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число
 * */
public class _Extra_1_HomeWork {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//      Перевод в двоичную систему
        System.out.println("Enter number(decimal system): ");
        int enteredNumber = sc.nextInt();

        String binaryResult = "";
        while (enteredNumber / 2 != 0 || enteredNumber % 2 != 0){

            binaryResult = binaryResult + (enteredNumber % 2);
            enteredNumber /= 2;
        }

        System.out.println("Result (binary system):" + binaryResult);

//      Перевод в десятичную систему
        System.out.println("Enter number(decimal system):");

        char[] mas = sc.next().toCharArray();

        int decimalResult = 0;
        for(int i = 0; i < mas.length; i++){
            if(mas[i] == '1'){
                decimalResult = decimalResult + (int)Math.pow(2,i);
            }
        }
        System.out.println("Result(decimal system): " + decimalResult);


    }
}
