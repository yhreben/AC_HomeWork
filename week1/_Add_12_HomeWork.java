package week1;

import java.util.Scanner;

/*
* Написать программу, которая в зависимости от характера ветра выдает
* сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
* умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4)
* */
public class _Add_12_HomeWork {
    public static void main(String[] args){
        int windSpeed;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите скорость ветра (м/с):");
        windSpeed = sc.nextInt();

        if(windSpeed < 1){
            System.out.println("Не корректное значение. Значение должно быть больше 0");
         }else if(windSpeed >= 1 & windSpeed <= 4){
            System.out.println("Скорость ветра " + windSpeed + " м/с - слабый (1)");
        }else if(windSpeed >= 5 & windSpeed <= 10){
            System.out.println("Скорость ветра " + windSpeed + " м/с - умеренный (2)");
        }else if(windSpeed >= 9 & windSpeed <= 18){
            System.out.println("Скорость ветра " + windSpeed + " м/с - сильный (3)");
        }else {
            System.out.println("Скорость ветра " + windSpeed + " м/с - ураганный (4)");
        }
        
    }
}
