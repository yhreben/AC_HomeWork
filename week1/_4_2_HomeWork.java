package week1;

import java.util.Scanner;

/*
* Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
* */
public class _4_2_HomeWork {
    public static void main(String[] args){
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = sc.nextInt();

        System.out.println("Введите второе число:");
        b = sc.nextInt();
        if(b > a){
            a = b;
        }

        System.out.println("Введите третье число:");
        b = sc.nextInt();
        if(b > a){
            a = b;
        }
        System.out.println("Максимальное число: " + a);
    }
}
