package week1;

import java.util.Scanner;

/*
* Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
* */
public class _4_4_HomeWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число с плавающей точкой:");
        float num = sc.nextFloat();
        if(num >= 0 & num <= 1){
            System.out.println("Число в диапазоне от 0 до 1");
        } else{
            System.out.println("Число вне диапазона от 0 до 1");
        }
    }
}
