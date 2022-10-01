public class Manager extends Employee implements Discountable{
    private final double DISCOUNT=0.25;

    public Manager(String name, char size, Clothing[] clothingItems) {

        super(name, size, clothingItems);
    }

//    @Override
//    public double getDiscount() {
//
//        return discount;
//    }

    @Override
    void printEmployeePriceAfterDiscount(Clothing clothing) {
        System.out.println(clothing.getPrice()-calcDiscount(clothing));
    }

    @Override
    public double calcDiscount(Clothing clothing) {

        return DISCOUNT*clothing.getPrice();
    }



}
