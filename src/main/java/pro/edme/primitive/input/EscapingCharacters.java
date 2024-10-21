package pro.edme.primitive.input;

/**
 * Экранирование символов
 * Вывести на экран следующий текст - две строки:
 * It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 * It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 * <p>
 * Подсказка:
 * \” – экранирование двойной кавычки;
 * \\ – экранирование обратной косой черты (\).
 * <p>
 * Больше про экранирование символов и Escape-последовательности в Java читай в статье.
 * <p>
 * Requirements:
 * 1. Программа должна выводить текст в методе 'main'.
 * 2. Название метода 'createText' менять нельзя.
 * 3. Текст первый строки должен быть: It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
 * 4. Текст второй строки должен быть: It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
 */

public class EscapingCharacters {
    public static void main(String[] args) {
        System.out.println(createText());
    }

    public static String createText() {
        //TODO: Напишите тут ваш код.
        String lineOne = null;
        String lineTwo = null;

        return lineOne + "\n" + lineTwo;
    }
}
