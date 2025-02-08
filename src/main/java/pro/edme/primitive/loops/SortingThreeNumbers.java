package pro.edme.primitive.loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Сортировка трех чисел.
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания.
 * Выведенные числа должны быть разделены пробелом.
 * <p>
 * Requirements:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Программа должна выводить числа на экран.
 * 3. Программа должна выводить три числа разделенных пробелами.
 * 4. Программа должна выводить числа в порядке убывания.
 * 5. Название метода 'sort' менять нельзя.
 */

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число1: ");
        int numberOne = in.nextInt();
        System.out.println("Введите число2: ");
        int numberTwo = in.nextInt();
        System.out.println("Введите число3: ");
        int numberThree = in.nextInt();

        System.out.println(sort(numberOne, numberTwo, numberThree));
    }

    public static String sort(int numberOne, int numberTwo, int numberThree) {
        StringBuilder result = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(numberOne);
        list.add(numberTwo);
        list.add(numberThree);
        list.sort(Collections.reverseOrder());
        for (Integer i : list) {
            result.append(i + " ");
        }
        return result.toString();
    }
}
