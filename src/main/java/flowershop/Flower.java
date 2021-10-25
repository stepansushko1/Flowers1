package flowershop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Arrays;

@Getter @Setter @ToString
public class Flower {

    private double price;
    private double sepalLenght;
    private int[] color;
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flType) {
        this.flowerType = flType;
    }

}

// done