package pro.edme.primitive.loops;

import java.util.Scanner;

/**
 * Суммирование.
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 * <p>
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 * <p>
 * while (true) {
 * int number = считываем число;
 * if (проверяем, что number -1)
 * break;
 * }
 * <p>
 * Requirements:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
 * 3. Программа должна посчитать сумму введенных чисел и вывести её на экран.
 * 4. В программе должен использоваться цикл for, while или do-while.
 */

public class Summation {
    public static void main(String[] args) {
        int result = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            int number = in.nextInt();
            result += number;
            if (number == -1) {
                System.out.println("result: " + result);
                break;
            }
        }
    }
}
