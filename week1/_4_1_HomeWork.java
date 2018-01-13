package week1;

import java.util.Scanner;

/*
* Пользователь вводит параметр с консоли (текущий час от 0 до 24)
* Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
* */
public class _4_1_HomeWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущее время от 0 до 24:");
        int hour = sc.nextInt();
        if(hour >= 9 & hour <= 18){
            System.out.println("Я на работе");
        } else{
            System.out.println("Я отдыхаю");
        }
    }
}
