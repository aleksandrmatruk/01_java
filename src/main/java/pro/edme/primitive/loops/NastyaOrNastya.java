package pro.edme.primitive.loops;

import java.util.Objects;
import java.util.Scanner;

/**
 * Настя или Настя?
 * Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
 * Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
 * Если имена и длины имен разные - ничего не выводить.
 * <p>
 * Requirements:
 * 1. Программа должна считывать две строки с клавиатуры.
 * 2. Программа должна содержать System.out.println() или System.out.print()
 * 3. Если имена одинаковые вывести сообщение "Имена идентичны"
 * 4. Если имена разные, но их длины равны, вывести сообщение "Длины имен равны"
 * 5. Если имена и длины имен разные - вывести пустую строку.
 * 6. Название метода 'compareNames' менять нельзя.
 */

public class NastyaOrNastya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя1: ");
        String nameOne = in.nextLine();
        System.out.println("Введите имя2: ");
        String nameTwo = in.nextLine();

        System.out.println(compareNames(nameOne, nameTwo));
    }

    public static String compareNames(String nameOne, String nameTwo) {
        if (Objects.equals(nameOne, nameTwo)) return "Имена идентичны";
        else if (nameOne.length() == nameTwo.length()) return "Длины имен равны";
        else return "";
    }
}
