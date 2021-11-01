package delivery;

import atoms.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
