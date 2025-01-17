package pro.edme.primitive.input;

/**
 * Выведи на экран таблицу умножения 10 на 10 в следующем виде:
 * 1 2 3 4 ...
 * 2 4 6 8 ...
 * 3 6 9 12 ...
 * 4 8 12 16 ...
 * ...
 * <p>
 * Requirements:
 * 1. Программа должна выводить текст в методе 'main'.
 * 2. Выведенный текст должен содержать 10 строк.
 * 3. Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
 * 4. Выведенные числа должны быть таблицей умножения.
 * 5. Название метода 'createMultiplicationTable' менять нельзя.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(createMultiplicationTable());
    }

    public static String createMultiplicationTable() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                result.append(i * j).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
