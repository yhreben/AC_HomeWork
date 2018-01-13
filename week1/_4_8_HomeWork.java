package week1;

import java.util.Scanner;

/*
Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
			124    4    -   true
			1456   567  -   false
			1      2    -   false
			18     98   -   true
* */
public class _4_8_HomeWork {
    public static void main(String[] args){
        int a;
        int b;
        boolean isTrue;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        a = sc.nextInt();

        System.out.println("Введите второе число:");
        b = sc.nextInt();
        isTrue = a%10 == b%10;
        System.out.println("Результат сравнения последних цифр этих чисел: " + isTrue);

    }
}
