package flowerstore;

import atoms.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Setter @ToString
public class Flower extends Item {
    private @Getter double sepalLength;
    private @Getter int[] color;
    private @Getter FlowerType flowerType;
    private double price;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    @Override
    public String getDescription() { return this.toString(); }

    public double price() {
        return this.price;
    }

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }
}
