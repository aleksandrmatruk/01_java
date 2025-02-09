package pro.edme.primitive.output;

/**
 * Минимум двух чисел.
 * Написать функцию, которая возвращает минимум из двух чисел.
 * <p>
 * Подсказка:
 * Нужно написать тело существующей функции min.
 * <p>
 * Requirements:
 * 1. Программа должна выводить текст в методе 'main' на экран.
 * 2. Метод min не должен выводить текст на экран.
 * 3. Метод main должен вызвать метод min три раза.
 * 4. Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
 * 5. Метод min должен возвращать минимальное значение из чисел a и b.
 * 6. Название метода 'min' менять нельзя.
 */

public class MinimumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }
}
