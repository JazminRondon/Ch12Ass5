public class Clothing {
    private String description;
    private double price;
    private char size;
    private final double discount=.25;


    public Clothing(String description, double price, char size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public double getPrice(){
        return price;
    }
    public char getSize(){
        return size;
    }
    public String toString(){
        return toString();
    }
    String[] clothingItems={"Jeans","T-Shirt","Dress"};

    public double calcDiscount(){
        return price*discount;
    }
}

