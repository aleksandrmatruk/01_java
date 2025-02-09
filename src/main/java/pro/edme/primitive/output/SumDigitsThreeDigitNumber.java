package pro.edme.primitive.output;

/**
 * Сумма цифр трехзначного числа.
 * Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число.
 * Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
 * <p>
 * Пример:
 * Метод sumDigitsInNumber вызывается с параметром 546.
 * <p>
 * Пример вывода:
 * 15
 * <p>
 * Requirements:
 * 1. Программа не должна считывать данные с клавиатуры.
 * 2. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
 * 3. Метод sumDigitsInNumber должен возвращать значение типа int.
 * 4. Метод sumDigitsInNumber не должен ничего выводить на экран.
 * 5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
 * 6. Название метода 'sumDigitsInNumber' менять нельзя.
 */

public class SumDigitsThreeDigitNumber {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
