package flowerstore;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private @Getter
    final List<FlowerPack> flowerPacks = new ArrayList<>();
    private @Getter int price;

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        price += flowerPack.getPrice();
    }
}
