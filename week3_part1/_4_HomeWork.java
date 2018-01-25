package week3_part1;

/*
Верхний регистр.

   		Напишите программу, которая позволяет пользователю ввести в консоли строку,
   		переводит первый символ слов в верхний регистр и результат выводит в консоль

   		Вход:
   		иван васильевич

   		Выход:
   		Иван Васильевич
*/

public class _4_HomeWork {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String sentence = sc.nextLine();

        String sentence = "иван васильевич меняет и профессию";

        System.out.println(sentence);

        String[] array = sentence.split(" ");

        firstLetterToUpperCase(array);
    }

    public static void firstLetterToUpperCase(String[] array) {

        String newSentence = "";

        for (int i = 0; i < array.length; i++) {

//            Работает, но лучше по-другому
//            array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);

            char[] symbolArray = array[i].toCharArray();
            symbolArray[0] = Character.toUpperCase(symbolArray[0]);

            array[i] = new String(symbolArray);
            newSentence += array[i] + " ";
        }

        System.out.println(newSentence);
    }
}
