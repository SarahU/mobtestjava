public class Apple implements Fruit {

    int number;
    int price;

    public Apple(int price) {
        this.number = 1;
        this.price = price;
    }

    public Apple(int number, int price) {
        this.number = number;
        this.price = price;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
