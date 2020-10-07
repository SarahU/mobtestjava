import java.util.ArrayList;
import java.util.Collection;

public class Cart {
    private ArrayList<Fruit> cart = new ArrayList<>();

    public void add(Fruit fruit) {
        cart.add(fruit);
    }

    public Collection getItems() {
        return cart;
    }

    public int getTotal() {
        return cart.stream().mapToInt(x -> x.getPrice()).sum();
    }
}
