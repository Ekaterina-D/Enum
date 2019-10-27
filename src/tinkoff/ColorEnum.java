package tinkoff;

/**
 * ColorEnum класс через enum.
 *
 * @version 1.0
 * @author Ekaterina Shubenkina
 */
public enum ColorEnum {
    RED("красный"),
    BLUE("синий"),
    GREEN("зеленый");
    private String color;

    ColorEnum(final String colorString) {
        this.color = colorString;
    }

    public String getColor() {
        return color;
    }
}