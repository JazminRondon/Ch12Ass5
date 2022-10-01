
import java.util.*;
public class ShopApp {



        //Use the Shop App to Check and print the total of your manager's cart
        public static double calcTotal(Clothing[] clothing){
            double total = 0.0;
            for(int i = 0; i < clothing.length; i++){
                total = total+clothing[i].getPrice();
            }
            return total;
        }
    public static boolean isAFit(Customer customer,Clothing clothing){

        if(customer.getSize() == clothing.getSize()){
            return true;
        }
        return false;

    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingList){
            //sort
        Collections.sort(clothingList,new SortingComparator());
        for (Clothing c:clothingList) {
            System.out.println(c.getPrice());
        }

    }
    public static void printEmployeeName(Employee employee) {
        if (employee instanceof HourlyEmployee) {
            System.out.println(employee.getName());
        }
        if (employee instanceof Manager) {
            System.out.println(employee.getName());
        }
    }
    public static void printDiscAmtOff(Discountable[] discount, Clothing clothing){
            for(Discountable d: discount){
                System.out.println(d.calcDiscount(clothing));
            }
    }
    }


