public abstract class Employee extends Customer implements Discountable {
    private final double discount=0.10;

//    public Employee(double discount) {
//        this.discount = discount;
//    }

    public double getDiscount() {

        return discount;
    }


    public abstract double calcDiscount();
    //  public abstract void printEmpPriceAfterDisc(Clothing){}
}
