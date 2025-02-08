package pro.edme.primitive.loops;

import java.util.Scanner;

/**
 * Время года.
 * Напиши метод checkSeason. По номеру месяца,
 * метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
 * <p>
 * Пример для номера месяца 2:
 * зима
 * <p>
 * Пример для номера месяца 5:
 * весна
 * <p>
 * Requirements:
 * 1. Программа должна выводить текст в методе 'main' на экран.
 * 2. Метод main должен вызывать метод checkSeason.
 * 3. Метод checkSeason должен быть static, и иметь только один параметр int.
 * 4. Метод checkSeason должен выводить текст на экран согласно заданию.
 * 5. Название метода 'checkSeason' менять нельзя.
 * 6. Нужно учесть случай, если такого месяца не существует, и вернуть 'Ошибка: Нет такого месяца!'
 */

public class TimeOfYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int number = in.nextInt();
        System.out.println(checkSeason(number));
    }

    public static String checkSeason(int number) {
        return switch (number) {
            case 12, 1, 2 -> "зима";
            case 3, 4, 5 -> "весна";
            case 6, 7, 8 -> "лето";
            case 9, 10, 11 -> "осень";
            default -> "Ошибка: Нет такого месяца!";
        };
    }
}
