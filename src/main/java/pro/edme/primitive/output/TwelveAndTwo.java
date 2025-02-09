package pro.edme.primitive.output;

/**
 * Комментарии излишни
 * Раскомментируй одну строчку, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2).
 * <p>
 * Requirements:
 * 1. Программа должна выводить на экран числа 12 и 2.
 * 2. Нельзя изменять строки с объявлением переменных.
 * 3. Программа должна содержать только две переменные типа int.
 * 4. Нельзя изменять строки отвечающие за вывод в консоль.
 * 5. Нужно раскомментировать одну строку и не менять остальные.
 * 6. Название метода 'getTwelveAndTwo' менять нельзя.
 */

public class TwelveAndTwo {
    public static void main(String[] args) {
        System.out.println(getTwelveAndTwo());
    }

    public static String getTwelveAndTwo() {
        int x = 2;
        int y = 12;

        // y = x * y;
         y = x + y;

        x = y - x;
        y = y - x;

        return x + " и " + y;
    }
}
