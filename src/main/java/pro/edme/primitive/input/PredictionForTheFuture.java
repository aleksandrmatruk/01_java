package pro.edme.primitive.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Предсказание на будущее.
 * Ввести с клавиатуры отдельно Имя, число1, число2.
 * Вывести надпись:
 * "Имя" получает "число1" через "число2" лет.
 * <p>
 * Пример:
 * Коля получает 3000 через 5 лет.
 * <p>
 * Requirements:
 * 1. Программа должна выводить текст в методе 'main'.
 * 2. Программа должна считывать данные с клавиатуры.
 * 3. Выведенный текст должен содержать введенное имя.
 * 4. Выведенный текст должен содержать введенное число1.
 * 5. Выведенный текст должен содержать введенное число2.
 * 6. Выведенный текст должен полностью соответствовать заданию.
 * 7. Получить данные с клавиатуры можно через
 * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 * 8. Читать строки из BufferedReader можно через String a = reader.readLine();
 * 9. Название метода 'createPrediction' менять нельзя.
 */

public class PredictionForTheFuture {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        System.out.println("Введите число1: ");
        Integer numberOne = Integer.valueOf(reader.readLine());
        System.out.println("Введите число2: ");
        Integer numberTwo = Integer.valueOf(reader.readLine());

        System.out.println(createPrediction(name, numberOne, numberTwo));
    }

    public static String createPrediction(String name, Integer numberOne, Integer numberTwo) {
        return String.format("%s получает %d через %d лет.", name, numberOne, numberTwo);
    }
}
