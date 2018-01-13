package week1;

import java.util.Scanner;

/*
* Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
* тавляется, если сумма покупки превышает 1000 гривен.
* */
public class _Add_8_HomeWork {
    public static void main(String[] args){
        double amount;
        String Discount = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму покупки:");
        amount = sc.nextDouble();

        if(amount > 1000){
            amount = amount - (double)amount * 0.1;
            Discount = " с учетом скидки";
        }
        System.out.println("Стоимость покупки" + Discount + ": " + amount + " грн.");
    }
}
