package week1;

import java.util.Scanner;

/*
* Известны две скорости, одна в километрах в час, другая в метрах в секун-
* ду. Какая из них больше?
* */
public class _Add_4_HomeWork {
    public static void main(String[] args){
        int kmPerHour;
        int mPerSecond;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value in Km/h:");
        kmPerHour = sc.nextInt();

        System.out.println("Enter value in m/s:");
        mPerSecond = sc.nextInt();

//      100 Km/h = 36 m/s. 1 Km/h = 0.36 m/s
        if(kmPerHour * 0.36f > mPerSecond){
            System.out.println("Entered value in Km/h is greater");
        }else if(kmPerHour * 0.36f < mPerSecond){
            System.out.println("Entered value in m/s is greater");
        }else{
            System.out.println("Entered values are equal");
        }
    }
}
