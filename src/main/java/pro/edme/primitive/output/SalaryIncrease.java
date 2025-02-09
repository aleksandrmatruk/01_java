package pro.edme.primitive.output;

/**
 * Прибавка к зарплате
 * В методе public static String hackSalary(int salary) увеличь зарплату на 100
 * и выведи на экран надпись: "Твоя зарплата составляет: <salary+100> долларов в месяц."
 * Где <salary+100> - это зарплата увеличенная на 100.
 * <p>
 * Подсказки:
 * Используй конструкцию "текст " + (salary+число) + " текст".
 * Удели внимание пробелам в тексте.
 * <p>
 * Пример вывода на экран для salary = 700:
 * Твоя зарплата составляет: 800 долларов в месяц.
 * <p>
 * Requirements:
 * 1. Программа должна выводить текст в методе 'main' на экран.
 * 2. Метод main не должен вызывать System.out.println или System.out.print.
 * 3. Метод hackSalary должен возвращать String.
 * 4. Метод main должен вызвать метод hackSalary только один раз.
 * 5. Метод hackSalary должен увеличить переданное число на 100 и вывести на экран надпись согласно шаблону.
 * 6. Название метода 'hackSalary' менять нельзя.
 */

public class SalaryIncrease {
    public static void main(String[] args) {
        hackSalary(700);
    }

    public static String hackSalary(int salary) {
        System.out.println("Твоя зарплата составляет: " + (salary + 100) + " долларов в месяц.");
        return "Твоя зарплата составляет: " + (salary + 100) + " долларов в месяц.";
    }
}
