import java.util.Arrays;
public class Customer extends Person{



    private char size;
    private Clothing[] clothingItems;

    public Customer(String name,char size, Clothing[] clothingItems) {
        super(name);
        this.size = size;
        this.clothingItems = clothingItems;
    }
    public Customer(String name, String description, double price, char size) {
        super(name);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "size=" + size +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                '}';
    }
}
