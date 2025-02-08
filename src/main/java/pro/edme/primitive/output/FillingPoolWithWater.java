package pro.edme.primitive.output;

/**
 * Набираем воду в бассейн.
 * Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
 * Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
 * Эти размеры передаются в метод getVolume.
 * Метод должен вернуть количество литров воды, которое нужно для наполнения бассейна.
 * <p>
 * Пример:
 * Метод getVolume вызывается с параметрами 25, 5, 2.
 * <p>
 * Пример вывода:
 * 250000
 * <p>
 * Requirements:
 * 1. Метод getVolume(int, int, int) должен быть публичным и статическим.
 * 2. Метод getVolume(int, int, int) должен возвращать значение типа long.
 * 3. Метод getVolume(int, int, int) не должен ничего выводить на экран.
 * 4. Метод getVolume(int, int, int) должен правильно возвращать количество воды,
 * которое необходимо для наполнения бассейна в литрах.
 * 5. Название метода 'getVolume' менять нельзя.
 */

public class FillingPoolWithWater {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        return (long) a * b * c * 1000;
    }
}
