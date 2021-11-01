package atoms;

public abstract class ItemDecorator extends Item {
    protected final Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }
}
