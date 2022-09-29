public class Main {
    public static void main(String[] args) {


        Clothing jeans = new Clothing("Ripped", 40.0, 'L');
        Clothing tShirt = new Clothing("Graphic", 20.0, 'L');
        Clothing skirt = new Clothing("Leather", 40.0, 'L');

        Clothing[] managerCart = {jeans, tShirt, skirt};
        Clothing[] employeeCart = {jeans, tShirt, skirt};

        Manager manager=new Manager("Jackie",'L',managerCart);
        HourlyEmployee employee= new HourlyEmployee("Jake",'L',employeeCart);



        System.out.println("The total price for the manager's cart");
        System.out.println(ShopApp.calcTotal(managerCart));
        



        }
    }