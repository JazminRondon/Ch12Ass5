public abstract class Employee extends Customer {
    private final double DISCOUNT=0.10;

//    public Employee(double discount) {
//        this.discount = discount;
//    }

    public Employee(String name,char size, Clothing[] clothingItems) {

        super(name,size, clothingItems);
    }

    public double getDiscount() {

        return DISCOUNT;
    }


    public  double calcDiscount(){
        return DISCOUNT;
    }
     abstract void printEmployeePriceAfterDiscount(Clothing clothing);//method signature
}
