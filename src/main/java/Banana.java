public class Banana implements Fruit {

    int number;
    int price;

    public Banana(int price) {
        this.number = 1;
        this.price = price;
    }

    public Banana(int number, int price) {
        this.number = number;
        this.price = price;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
