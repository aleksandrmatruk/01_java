package pro.edme.primitive.loops;

/**
 * Треугольник из восьмерок.
 * Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 * <p>
 * Пример вывода на экран:
 * 8
 * 88
 * 888
 * 8888
 * 88888
 * 888888
 * 8888888
 * 88888888
 * 888888888
 * 8888888888
 * <p>
 * Requirements:
 * 1. Программа не должна считывать числа c клавиатуры.
 * 2. Программа должна выводить числа на экран.
 * 3. Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 * 4. В программе должен использоваться цикл for.
 * 5. Название метода 'getTriangle' менять нельзя.
 */

public class EightTriangle {
    public static void main(String[] args) {
        System.out.println(getTriangle());
    }

    public static String getTriangle() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append("8".repeat(i));
            result.append("\n");
        }

        return result.toString();
    }
}
