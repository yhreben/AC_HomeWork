package week1;

import java.util.Scanner;

/*
* Написать программу вычисления идеального веса пользователя (рост-
* 100). Выдать рекомендации о необходимости поправиться либо поху-
* деть
* */
public class _Add_9_HomeWork {
    public static void main(String[] args){
        int height;
        int weight;

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите свой рост:");
        height = sc.nextInt();

        System.out.println("Укажите свой вес:");
        weight = sc.nextInt();

        if(height - 100 > weight){
            System.out.println("Вам необходимо поправиться на: " + (height - 100 - weight) + " кг.");
        }else if(height - 100 < weight){
            System.out.println("Вам необходимо похудеть на: " + Math.abs(height - 100 - weight) + " кг.");
        }else{
            System.out.println("Красавчик. У тебя идеальный вес.");
        }
    }
}
