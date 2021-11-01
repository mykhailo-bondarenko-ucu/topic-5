package decorators;

import atoms.Item;
import atoms.ItemDecorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return 13 + item.price();
    }
}
