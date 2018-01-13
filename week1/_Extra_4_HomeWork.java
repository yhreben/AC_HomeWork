package week1;

import java.util.Scanner;

/*
 * По данному числу n определите n-е число Фибоначчи φn
 * */
public class _Extra_4_HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//n        0	1	2	3	4	5	6	7	8	9	10
//F        0	1	1	2	3	5	8	13	21	34	55

        System.out.println("Enter number(n):");
        int enteredNumber = sc.nextInt();

        int n = 1;
        int prevNo = 0;
        int beforePrevNo = 1;
        int fibonacciNo = 1;
        if (enteredNumber == 0) {
            fibonacciNo = 0;
        } else {
            while (n <= enteredNumber) {
                fibonacciNo = beforePrevNo + prevNo;
                beforePrevNo = prevNo;
                prevNo = fibonacciNo;
                n++;
            }

        }

        System.out.println(enteredNumber + "-е число Фибоначчи = " + fibonacciNo);
    }
}
