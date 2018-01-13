package week1;

import java.util.Scanner;

/*
* Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и
* показываем результат деления (целую часть от деления  и остачу)
* в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
* */
public class _4_7_HomeWork {
    public static void main(String[] args){
        int a;
        int b;
        boolean isTrue;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        a = sc.nextInt();

        System.out.println("Введите второе число:");
        b = sc.nextInt();
        isTrue = a % b == 0 | b % a == 0;
        System.out.println(
                    "Результат: " + isTrue
                                  + "; Целая часть от деления a на b: " + a/b
                                  + "; Остача от деления a на b: " + a%b
                                  + "; Целая часть от деления b на a: " + b/a
                                  + "; Остача от деления b на a: " + b%a);

    }
}
