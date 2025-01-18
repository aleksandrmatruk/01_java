package pro.edme.primitive.input;

import java.util.Scanner;

/**
 * План по захвату мира.
 * Ввести с клавиатуры число и имя, вывести на экран строку:
 * "имя" захватит мир через "число" лет. Му-ха-ха!
 * <p>
 * Пример:
 * Вася захватит мир через 8 лет. Му-ха-ха!
 * <p>
 * Последовательность вводимых данных имеет большое значение.
 * <p>
 * Requirements:
 * 1. Программа должна выводить текст в методе 'main'.
 * 2. Программа должна считывать данные с клавиатуры.
 * 3. Выведенный текст должен содержать введенное имя.
 * 4. Выведенный текст должен содержать введенное число.
 * 5. Выведенный текст должен полностью соответствовать заданию.
 * 6. ЧИСЛО ДОЛЖНО БЫТЬ Integer !!!
 * 7. Название метода 'takeOverTheWorld' менять нельзя.
 */

public class PlanTakeOverTheWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        Integer age = in.nextInt();

        System.out.println(takeOverTheWorld(name, age));
    }

    public static String takeOverTheWorld(String name, Integer age) {
        return String.format("%s захватит мир через %d лет. Му-ха-ха!", name, age);
    }
}
