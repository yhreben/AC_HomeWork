package week1;

import java.util.Scanner;

/*
* Известны площади круга и квадрата. Определить: а) уместится ли круг в
* квадрат; б) уместится ли квадрат в круге.
* */
public class _Add_15_HomeWork {
    public static void main(String[] args){
        int circleArea;
        int squareArea;
        float pi = 3.14f;
        double squareSide;
        double squareDiagonal;
        double circleDiametr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите площадь круга:");
        circleArea = sc.nextInt();

        System.out.println("Укажите площадь квадрата:");
        squareArea = sc.nextInt();

//      Площадь квадрата = сторона во 2 степени
//      Площадь круга = (pi/4)*дигаональ во 2 степени
//      Диагональ квадрата является гипотенузой равностороннего прямоугольного треугольника

        squareSide = Math.sqrt(squareArea);
        System.out.println("Сторона квадрата = " + squareSide);

        squareDiagonal = squareSide * Math.sqrt(2);
        System.out.println("Диагональ квадрата = " + squareDiagonal);

        circleDiametr = 2 * Math.sqrt(circleArea/pi);
        System.out.println("Диаметр круга = " + circleDiametr);

        if(squareDiagonal <= circleDiametr){
            System.out.println("квадрат уместится в круге");
        }else{
            System.out.println("квадрат не уместится в круге");
        }

        if(circleDiametr <= squareSide){
            System.out.println("круг уместится в квадрат");
        }else{
            System.out.println("круг не уместится в квадрат");
        }

    }
}
