package delivery;

import atoms.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("Sent a postman to deliver " + items);
        return true;
    }
}
