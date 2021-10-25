import flowerstore.Flower;
import flowerstore.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[10];
        FlowerType[] flowerTypes = {FlowerType.CHAMOMILE, FlowerType.ROSE, FlowerType.TULIP};
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(flowerTypes[i % 3]);
            int[] col = {127, 0, 0};
            flowers[i].setColor(col);
        }
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
