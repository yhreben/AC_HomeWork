package week3_part1;

/*
Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
    Результат выводить на консоль.

    Ввод:
    Как решить это задание и не сломать себе голову?

    Вывод:
    каК еиь отэ ааи и е ьтамолс ее ?уволог
*/

public class _5_HomeWork {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //String sentence = sc.nextLine();

        String sentence = "Как решить это задание и не сломать себе голову?";

        System.out.println(sentence);

        String[] array = sentence.split(" ");

        invertSentence(array);

    }

    public static void invertSentence(String[] array) {
        String newSentence = "";

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {

                array[i] = invertWord(array[i]);
            } else {

                array[i] = invertEvenLetter(array[i]);
            }

            newSentence += array[i] + " ";
        }

        System.out.println(newSentence);
    }

    public static String invertEvenLetter(String word) {

        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                newWord += word.charAt(i);
            }
        }

        return newWord;
    }

    public static String invertWord(String word) {

        char[] array = word.toCharArray();


        for (int i = 0; i < array.length / 2; i++) {

            char letter = array[i];

            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = letter;

        }

        String newWord = new String(array);

        return newWord;
    }

}