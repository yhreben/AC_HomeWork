package week1;

import java.util.Scanner;

/*
* Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
* */
public class _4_6_HomeWork {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = sc.nextInt();

        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        if(a + b >= 11 & a + b <= 19){
            System.out.println("Сумма введенных чисел равна " + (a+b) + " и находится в диапазоне от 11 до 19");
        }
    }
}
