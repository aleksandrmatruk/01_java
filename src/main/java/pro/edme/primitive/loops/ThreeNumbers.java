package pro.edme.primitive.loops;

import java.util.Scanner;

/**
 * Три числа.
 * Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
 * Вывести на экран порядковый номер числа, отличного от остальных.
 * <p>
 * Пример для чисел 4 6 6:
 * 1
 * <p>
 * Пример для чисел 6 6 3:
 * 3
 * <p>
 * Requirements:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Программа должна использовать команды System.out.println() или System.out.print().
 * 3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
 * 4. Если все числа разные, выводить 0.
 * 5. Название метода 'getDifferentNumber' менять нельзя.
 */

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число1: ");
        int numberOne = in.nextInt();
        System.out.println("Введите число2: ");
        int numberTwo = in.nextInt();
        System.out.println("Введите число3: ");
        int numberThree = in.nextInt();
        System.out.println(getDifferentNumber(numberOne, numberTwo, numberThree));
    }

    public static int getDifferentNumber(int numberOne, int numberTwo, int numberThree) {
        if (numberOne == numberTwo) {
            return 3;
        } else if (numberOne == numberThree) {
            return 2;
        } else if (numberTwo == numberThree) {
            return 1;
        } else return 0;
    }
}
