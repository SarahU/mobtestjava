public class Banana implements Fruit {
    int price;
    int number;

    public Banana(int price) {
        this.price = price;
    }

    public Banana(int number, int price) {
        this.number = number;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
