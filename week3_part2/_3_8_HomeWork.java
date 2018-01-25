package week3_part2;

/*
Удалить из предложения слова которые повторяются.
*/

public class _3_8_HomeWork {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        //String sentence = sc.nextLine();

        String sentence = "Я не знаю не знаю как же решить решить как же не знаю это задание это";

        System.out.println(sentence);

        String[] array = sentence.split(" ");

        deleteDuplicates(array);

    }

    public static void deleteDuplicates(String[] array) {
        String newSentence = "";

        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            for (int j = 0; j < array.length; j++) {
                if (i != j && !array[j].isEmpty() && word.equals(array[j])) {

                    array[j] = "";
                }
            }

            if (!array[i].isEmpty())
            newSentence += array[i] + " ";
        }

        System.out.println(newSentence);
    }

}