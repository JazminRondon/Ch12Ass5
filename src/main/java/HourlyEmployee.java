public class HourlyEmployee extends Employee implements Discountable{
    private final double discount=0.10;

    public HourlyEmployee(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing) {

        System.out.println(clothing.getPrice()-calcDiscount(clothing)); //price - discount

    }


    @Override
    public double calcDiscount(Clothing clothing) {

        return getDiscount()*clothing.getPrice();
    }


}
