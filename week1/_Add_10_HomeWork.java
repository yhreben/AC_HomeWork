package week1;

import java.util.Scanner;

/*
* Написать программу вычисления стоимости переговоров, если по суббо-
* там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
* ность разговора и день недели (цифра от 1 до 7).
* */
public class _Add_10_HomeWork {
    public static void main(String[] args){
        int duration;
        int dayOfWeek;
        int costForHour = 1000;
        double costForDiscountHour = costForHour - (double)costForHour * 0.2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите продолжительность разговора в часах:");
        duration = sc.nextInt();

        System.out.println("Укажите день недели(цифра от 1 до 7):");
        dayOfWeek = sc.nextInt();

        if(dayOfWeek == 6 | dayOfWeek == 7){
            System.out.println("Стоимость переговоров: " + (duration * costForDiscountHour));
        }else{
            System.out.println("Стоимость переговоров: " + (duration * costForHour));
        }
    }
}
