package week1;

import java.util.Scanner;

/*
 * Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является,
 * то есть выведите такое число n, что φn=A.
 * Если А не является числом Фибоначчи, выведите число -1.
 * */
public class _Extra_5_HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//n        0	1	2	3	4	5	6	7	8	9	10
//F        0	1	1	2	3	5	8	13	21	34	55

        System.out.println("Enter number:");
        int enteredNumber = sc.nextInt();

        int n = 0;
        int prevNo = 1;
        int beforePrevNo = 0;
        int fibonacciNo = 0;
        int prevFibonacciNo = 0;
        if (enteredNumber == 0) {
            n = 0;
        } else {
            while (fibonacciNo <= enteredNumber) {
//                при равенстве заходим в цикл еще раз
//                поэтому вводим переменную для предыдущего значения
                prevFibonacciNo = fibonacciNo;
                fibonacciNo = beforePrevNo + prevNo;
                beforePrevNo = prevNo;
                prevNo = fibonacciNo;
                n++;
            }

        }

        if (enteredNumber == prevFibonacciNo){
            System.out.println("n-е число Фибоначчи = " + n);
        }else
            System.out.println(-1);

    }
}
