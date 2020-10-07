import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCarTest {
    @Test
    public void addApple(){
        Apple apple = new Apple(5);
        Cart cart = new Cart();
        cart.add(apple);

        assertEquals(cart.getItems().size(), 1);
    }

    @Test
    public void addBanana(){
        Banana banana = new Banana(5);

        Cart cart = new Cart();
        cart.add(banana);

        assertEquals(cart.getItems().size(), 1);
    }

    @Test
    public void addBananaWithPrice(){
        Banana banana = new Banana(5);

        Cart cart = new Cart();
        cart.add(banana);

        assertEquals(cart.getTotal(), 5);
    }

    @Test
    public void addBananaAndAppleWithPrices(){
        Banana banana = new Banana(5);
        Apple apple = new Apple(5);

        Cart cart = new Cart();
        cart.add(banana);
        cart.add(apple);

        assertEquals(cart.getTotal(), 10);
    }

    @Test
    public void getTotalPriceOfMultipleBananas(){
        Banana banana = new Banana(10, 5);
        Apple apple = new Apple(5);

        Cart cart = new Cart();
        cart.add(banana);
        cart.add(apple);

        assertEquals(cart.getTotal(), 10);
    }
}
