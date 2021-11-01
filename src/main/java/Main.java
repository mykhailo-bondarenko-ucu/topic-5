import atoms.ItemDecorator;
import decorators.BasketDecorator;
import decorators.PaperDecorator;
import decorators.RibbonDecorator;
import flowerstore.Flower;
import flowerstore.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[10];
        FlowerType[] flowerTypes = {
                FlowerType.CHAMOMILE, FlowerType.ROSE, FlowerType.TULIP,
                FlowerType.CACTUS, FlowerType.ROMASHKA
        };
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(flowerTypes[i % 5]);
            int[] col = {127, 0, 0};
            flowers[i].setColor(col);
            flowers[i].setPrice(123 * (i + 1));
        }
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
        ItemDecorator[] decoratedFlowers = new ItemDecorator[10];
        for (int i = 0; i < decoratedFlowers.length; i++) {
            if (i % 3 == 0) {
                decoratedFlowers[i] = new BasketDecorator(flowers[i]);
            } else if (i % 3 == 1) {
                decoratedFlowers[i] = new PaperDecorator(flowers[i]);
            } else {
                decoratedFlowers[i] = new RibbonDecorator(flowers[i]);
            }
        }
        for (ItemDecorator decoratedFlower : decoratedFlowers) {
            System.out.println(decoratedFlower);
        }
    }
}
