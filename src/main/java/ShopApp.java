public class ShopApp {



        //Use the Shop App to Check and print the total of your manager's cart
        public static void calcTotal(Clothing[] managerCart){
            int x=0;
            while(x< managerCart.length){
                System.out.println(managerCart[x].calcDiscount());
                x++;
            }
        }
    }


