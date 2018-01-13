package week1;

import java.util.Scanner;

/*
* Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
* лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
* */
public class _Add_1_HomeWork {
    public static void main(String[] args){
        double a;
        double b;
        double c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter triangle side a:");
        a = sc.nextDouble();

        System.out.println("Enter triangle side b:");
        b = sc.nextDouble();

        System.out.println("Enter triangle side c:");
        c = sc.nextDouble();

        if(Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
            System.out.println("Right triangle. Hypotenuse is side a");
        }else if (Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2)){
            System.out.println("Right triangle. Hypotenuse is side b");
        }else if (Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)) {
            System.out.println("Right triangle. Hypotenuse is side c");
        }else {
            System.out.println("Not right triangle.");
        }

    }
}
