package delivery;

import atoms.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Delivering using DHL: " + items);
        return true;
    }
}
