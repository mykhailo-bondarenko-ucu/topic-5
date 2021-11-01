package decorators;

import atoms.Item;
import atoms.ItemDecorator;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return 4 + item.price();
    }
}
