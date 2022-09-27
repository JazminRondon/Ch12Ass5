public class HourlyEmployee extends Employee implements Discountable{
    @Override
    public double calcDiscount(Clothing clothing) {
        return 0;
    }

    @Override
    public double calcDiscount() {
        return 0;
    }
}
