package week1;

import java.util.Scanner;

/*
* Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
* */
public class _4_5_HomeWork {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = sc.nextInt();

        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        if(a > b){
            System.out.println("Первое число больше второго. Разница чисел: " + (a-b));
        } else {
            System.out.println("Первое число меньше второго. Сумма чисел: " + (a+b));
        }
    }
}
