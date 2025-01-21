package pro.edme.primitive.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Существует ли пара?
 * Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
 * Если такая пара существует, вывести на экран числа через пробел.
 * Если все три числа равны между собой, то вывести все три.
 * <p>
 * Примеры:
 * а) при вводе чисел
 * 1
 * 2
 * 2
 * получим вывод
 * 2 2
 * <p>
 * б) при вводе чисел
 * 2
 * 2
 * 2
 * получим вывод
 * 2 2 2
 * <p>
 * Requirements:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Программа должна содержать System.out.println() или System.out.print()
 * 3. Если два числа равны между собой, необходимо вывести числа на экран.
 * 4. Если все три числа равны между собой, необходимо вывести все три.
 * 5. Если нет равных чисел, выводить пустую строку.
 * 6. Название метода 'checkPair' менять нельзя.
 */

public class DoesPairExist {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число1: ");
        int numberOne = Integer.parseInt(reader.readLine());
        System.out.println("Введите число2: ");
        int numberTwo = Integer.parseInt(reader.readLine());
        System.out.println("Введите число3: ");
        int numberThree = Integer.parseInt(reader.readLine());

        System.out.println(checkPair(numberOne, numberTwo, numberThree));
    }

    public static String checkPair(int numberOne, int numberTwo, int numberThree) {

        String result = "";
        if (numberOne == numberTwo && numberOne == numberThree)
            result = String.format("%d %d %d ", numberOne, numberTwo, numberThree);
        else if (numberOne == numberTwo) result = String.format("%d %d", numberOne, numberTwo);
        else if (numberOne == numberThree) result = String.format("%d %d", numberOne, numberThree);
        else if (numberTwo == numberThree) result = String.format("%d %d", numberTwo, numberThree);

        return result;
    }
}
