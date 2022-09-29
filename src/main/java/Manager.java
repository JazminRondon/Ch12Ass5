public class Manager extends Employee implements Discountable{
    private final double discount=0.25;

    public Manager(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public double calcDiscount(Clothing clothing) {

        return clothing.getPrice()* discount;
    }



}
