public class Main {
    public static <String> void main(String[] args){

        Clothing jeans=new Clothing("Ripped",40.0,'L');
        Clothing tShirt=new Clothing("Graphic",20.0,'L');
        Clothing skirt=new Clothing("Leather",40.0,'L');

        Clothing[] managerCart={jeans,tShirt,skirt};
        Clothing[] employeeCart={jeans,tShirt,skirt};
    }
    ShopApp.calDiscount();
}
