package pro.edme.primitive.loops;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Ярлыки и числа.
 * Предать в функцию целое число. Вывести на экран его строку-описание следующего вида:
 * "Отрицательное четное число" - если число отрицательное и четное,
 * "Отрицательное нечетное число" - если число отрицательное и нечетное,
 * "Положительное четное число" - если число положительное и четное,
 * "Положительное нечетное число" - если число положительное и нечетное.
 * "Ноль" - если число равно 0.
 * <p>
 * Requirements:
 * 1. Название метода 'getLabelByNumber' менять нельзя.
 * 2. Метод 'getLabelByNumber' должен принимать тип данных BigInteger.
 */

public class LabelsAndNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        BigInteger number = BigInteger.valueOf(Integer.parseInt(in.nextLine()));

        System.out.println(getLabelByNumber(number));
    }

    public static String getLabelByNumber(BigInteger number) {
        if (number.signum() == 1 && !number.testBit(0)) return "Положительное четное число";
        else if (number.signum() == 1 && number.testBit(0)) return "Положительное нечетное число";
        else if (number.signum() == -1 && number.testBit(0)) return "Отрицательное нечетное число";
        else if (number.signum() == -1 && !number.testBit(0)) return "Отрицательное четное число";
        else return "Ноль";

    }
}
