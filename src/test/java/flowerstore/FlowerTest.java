package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private final int[] col = new int[3];

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        col[0] = 1; col[1] = 2; col[2] = 3;
        flower.setColor(col);
    }

    @org.junit.jupiter.api.Test
    void setColor() {
        int[] colS = {1, 1, 1};
        flower.setColor(colS);
        assertArrayEquals(colS, flower.getColor());
        assertNotEquals(col, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        col[1] = 3;
        int[] colE = {1, 2, 3};
        assertArrayEquals(colE, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower.getFlowerType());
    }
}