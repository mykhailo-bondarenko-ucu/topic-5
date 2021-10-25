package flowerstore;

import java.util.List;

public class Store {
    public static FlowerBucket search(String query) {
        String[] words = query.split(" ");
        int count = Integer.parseInt(words[0]);
        FlowerType type = FlowerType.CHAMOMILE;
        for (FlowerType flowerType : FlowerType.values()) {
            if (words[1].toUpperCase().equals(flowerType.name())) {
                type = flowerType;
                break;
            }
        }
        FlowerBucket ret = new FlowerBucket();
        ret.addFlowerPack(new FlowerPack(new Flower(type), count));
        return ret;
    }
}
