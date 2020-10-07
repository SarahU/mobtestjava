import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private ArrayList<Fruit> cart = new ArrayList<>();
    private Offer offer;

    public Cart(){}

    public Cart(Offer offer) {
        this.offer = offer;
    }

    public void add(Fruit fruit) {
        cart.add(fruit);
    }

    public Collection getItems() {
        return cart;
    }

    public int getTotal() {
        List<Boolean> apples = cart.stream().filter(x ->  x instanceof offer.).collect(Collectors.toList());


        return cart.stream().mapToInt(x -> x.getPrice() * x.getNumber()).sum();
    }
}
