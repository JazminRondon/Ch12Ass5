public abstract class Manager extends Employee implements Discountable{
    private final double discount=0.25;




    @Override
    public double calcDiscount() {
        return discount;
    }


}
