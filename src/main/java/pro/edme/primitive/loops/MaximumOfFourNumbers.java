package pro.edme.primitive.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Максимум четырех чисел.
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них.
 * Если числа равны между собой, необходимо вывести любое.
 * <p>
 * Requirements:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Программа должна выводить число на экран.
 * 3. Программа должна выводить на экран максимальное из четырёх чисел.
 * 4. Если максимальных чисел несколько, необходимо вывести любое из них.
 * 5. Название метода 'getMaxOfFour' менять нельзя.
 */

public class MaximumOfFourNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число1: ");
        int numberOne = in.nextInt();
        System.out.println("Введите число2: ");
        int numberTwo = in.nextInt();
        System.out.println("Введите число3: ");
        int numberThree = in.nextInt();
        System.out.println("Введите число4: ");
        int numberFour = in.nextInt();

        System.out.println(getMaxOfFour(numberOne, numberTwo, numberThree, numberFour));
    }

    public static int getMaxOfFour(int numberOne, int numberTwo, int numberThree, int numberFour) {
        if (numberOne > numberTwo && numberOne > numberThree && numberOne > numberFour) return numberOne;
        else if (numberTwo > numberOne && numberTwo > numberThree && numberTwo > numberFour) return numberTwo;
        else if (numberThree > numberOne && numberThree > numberTwo && numberThree > numberFour) return numberThree;
        else return numberFour;

    }
}
