package builder;

import lombok.Builder;

@Builder
// Builder - пошаговое создание сложного обьекта
public class House {
    private String window;
    private String door;
    private Integer cost;
    private String color;
    private String roof;

    @Override
    public String toString() {
        return "House{" +
                "window='" + window + '\'' +
                ", door='" + door + '\'' +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
