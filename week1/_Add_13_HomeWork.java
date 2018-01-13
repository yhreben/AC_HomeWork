package week1;

/*
* Даны три числа A,B,C. Увеличить числа в два
* раза, если A+B+C>0, в противном случае заменить
* на нули.
* */
public class _Add_13_HomeWork {
    public static void main(String[] args){
        int a = -4;
        int b = -3;
        int c = 4;
        int result;

        if(a + b + c > 0 ){
            a = a * 2;
            b = b * 2;
            c = c * 2;
        }else{
            a = 0;
            b = 0;
            c = 0;
        }
        System.out.println(a+b+c);
    }
}
