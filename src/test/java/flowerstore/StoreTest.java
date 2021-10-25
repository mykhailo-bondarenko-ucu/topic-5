package flowerstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    @Test
    void search() {
        FlowerBucket r = Store.search("10 rose");
        assertEquals(10, r.getFlowerPacks().get(0).getAmount());
        assertEquals(FlowerType.ROSE, r.getFlowerPacks().get(0).getFlower().getFlowerType());
    }
}