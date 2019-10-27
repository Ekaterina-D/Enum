package tinkoff;

/**
 * ColorClass класс с переменными в которых содержаться цвета.
 *
 * @version 1.0
 * @author Ekaterina Shubenkina
 */
public final class ColorClass {
    public static final ColorClass RED = new ColorClass("красный");
    public static final ColorClass BLUE = new ColorClass("синий");
    public static final ColorClass GREEN = new ColorClass("зеленый");
    private String color;

    private ColorClass(final String colorString) {
        this.color = colorString;
    }

    public String getColor() {
        return color;
    }
}