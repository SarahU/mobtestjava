public class Apple implements Fruit {

    int price;

    public Apple(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
