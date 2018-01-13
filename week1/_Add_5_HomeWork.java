package week1;

import java.util.Scanner;

/*
* Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
* пара равных
* */
public class _Add_5_HomeWork {
    public static void main(String[] args){
        int a = 4;
        int b = 3;
        int c = 4;

        if(a == b | a == c | b == c ){
            System.out.println("Some numbers are equal");
        }else{
            System.out.println("All numbers are different");
        }

    }
}
