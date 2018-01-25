package week3_part2;

/*
3.6. Нули
		Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
		Вход:
		10001101001
		Выход:
		(2,4) - цепочка нулей
		(5,6) - цепочка единиц
*/

public class _3_6_HomeWork {
    public static void main(String[] args) {

        String sentence = "10001101001";

        System.out.println(sentence);

        findSequenceOfValues(sentence, '0');
    }

    public static void findSequenceOfValues(String sentence, char value) {

        char[] array = sentence.toCharArray();
        int zeroIndex = sentence.indexOf(value);

        if (zeroIndex == -1) {
            System.out.printf("Symbol %s not found", value);
            return;
        }

        int maxIndex = 0;
        int length = 0;
        int maxLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                length++;
                if (length >= maxLength) {
                    maxLength = length;
                    maxIndex = i;
                }
            } else {
                length = 0;
            }
        }

        // Добавляю 1, чтобы соответсвовало условию задачи(что первый элемент не 0, а 1)
        int rangeTill = maxIndex + 1;
        int rangeFrom = rangeTill - maxLength + 1;
        System.out.printf("Sequence of %s: (%d,%d)", value, rangeFrom, rangeTill);
        System.out.println();
        System.out.println("maxIndex = " + maxIndex);
        System.out.println("maxLength = " + maxLength);
    }

}