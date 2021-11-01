package flowerstore;

import atoms.Item;
import flowerstore.exceptions.FlowerNotFoundException;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket extends Item {
    private @Getter
    final List<FlowerPack> flowerPacks = new ArrayList<>();
    private double price;

    public void addFlowers(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        price += flowerPack.getPrice();
    }

    public FlowerPack searchFlower(FlowerType flowerType) throws FlowerNotFoundException {
        for (FlowerPack flowerPack : flowerPacks) {
            if (flowerPack.getFlower().getFlowerType().equals(flowerType)) {
                return flowerPack;
            }
        }
        throw new FlowerNotFoundException("No flower of type " + flowerType.name());
    }

    @Override
    public String getDescription() {
        return this.toString();
    }

    @Override
    public double price() {
        return this.price;
    }
}
