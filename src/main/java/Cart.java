import java.util.ArrayList;
import java.util.Collection;

public class Cart {
    private ArrayList<Apple> cart;

    public void add(Apple apple) {
        cart = new ArrayList<Apple>();
        cart.add(apple);
    }

    public Collection getItems() {
        return cart;
    }
}
