package pro.edme.primitive.output;

/**
 * 2 + 3 = 5
 * Закомментируй ненужные строки кода, чтобы на экран вывелась надпись:
 * 2 плюс 3 равно 5
 * Примечание: комментировать строки с объявлением переменных int a и int b нельзя.
 * <p>
 * Requirements:
 * 1. Программа должна выводить на экран надпись "2 плюс 3 равно 5"
 * 2. Нельзя изменять строки с объявленными переменными int a и int b.
 * 3. Нужно закомментировать хотя бы одну строку.
 * 4. Нельзя изменять (можно закомментировать) или добавлять команды, отвечающие за вывод.
 * 5. Название метода 'getText' менять нельзя.
 */

public class TwoPlusThreeIsFive {
    public static void main(String[] args) {
        System.out.println(getText());
    }

    public static String getText() {
        int a = 3;
        int b = 2;

        String result = new StringBuilder()
                .append("два")
                .append(b)
                .append(" плюс ")
                .append(" минус ")
                .append(a)
                .append("три")
                .append(" равно ")
                .append(" будет ")
                .append("пять")
                .append(a + b)
                .toString();

        return result;
    }
}
