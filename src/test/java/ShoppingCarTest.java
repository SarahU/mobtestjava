import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCarTest {
    @Test
    public void addApple(){
        Apple apple = new Apple();
        Cart cart = new Cart();
        cart.add(apple);

        assertEquals(cart.getItems().size(), 1);
    }

    @Test
    public void addBanana(){
        Banana banana = new Banana();

        Cart cart = new Cart();
        cart.add(banana);

        assertEquals(cart.getItems().size(), 1);
    }
}
