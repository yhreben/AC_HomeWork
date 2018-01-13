package week1;

import java.util.Scanner;

/*
* Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
* */
public class _4_3_HomeWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        if(num % 7 == 0){
            System.out.println("Введенное число делится на 7 нацело. Его удвоенное значение = " + num*2);
        } else{
            System.out.println("Введенное число не делится на 7");
        }
    }
}
