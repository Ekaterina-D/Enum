package tinkoff;

/**
 * Utils класс с двумя методами на вывод текста.
 *
 * @version 1.0
 * @author Ekaterina Shubenkina
 */
public final class Utils {

    public static void print(final String text) {
        System.out.println(text);
    }

    public static void print(final String text, final Color color) {
        System.out.println(color + text + Color.ANSI_RESET);
    }

    private Utils() {
        throw new IllegalStateException("Utility class");
    }
}