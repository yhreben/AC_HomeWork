package week1;

import java.util.Scanner;

/*
* Написать программу, которая при вводе числа в диапазоне от 1 до 99
* добавляет к нему слово "копейка" в правильной форме. Например, 1
* копейка, 5 копеек, 42 копейки .
* */
public class _Add_11_HomeWork {
    public static void main(String[] args){
        int num;
        int count1;
        int count2;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число в диапазоне от 1 до 99:");
        num = sc.nextInt();
        count1 = num%100;
        count2 = num%10;

        if(count1 == 11 | count1 == 12 | count1 == 13 | count1 == 14){
            str = " копеек";
        }else if (count2 == 2 | count2 == 3 | count2 == 4){
            str = " копейки";
        }else if(count2 == 1){
            str = " копейка";
        }else{
            str = " копеек";
        }
        System.out.println(num + str);
    }
}
