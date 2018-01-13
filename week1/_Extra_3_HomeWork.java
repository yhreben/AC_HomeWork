package week1;

import jdk.nashorn.internal.runtime.NumberToString;

import java.util.Scanner;

/*
* Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
* */
public class _Extra_3_HomeWork {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");

        char[] mas = sc.next().toCharArray();

        for(int i = 0; i < mas.length; i++){
            if(mas[i] == '8'){
                count++;
            }
        }
        System.out.println(count);
    }

}
