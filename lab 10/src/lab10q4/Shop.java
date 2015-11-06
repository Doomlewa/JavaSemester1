package lab10q4;
import java.util.Scanner;
public class Shop {

    public static void main(String[] args) {
        String itemName; 
        String keepShopping = "y";
        int valid=0;
        
        double itemPrice;
        int quantity; 
        ShoppingCart cart = new ShoppingCart();
        Scanner scan = new Scanner(System.in); 
       
        while (keepShopping.equals("y"))
        {
            System.out.print ("Enter the name of the item: "); 
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: "); 
            itemPrice = scan.nextDouble(); 
            System.out.print ("Enter the quantity: "); 
            quantity = scan.nextInt();
            scan.nextLine();
            cart.addToCart(itemName, itemPrice, quantity);
            System.out.println(cart);
            while (valid!=1)
            {
                System.out.println("Would you like to continue shopping? (Y/N)");
                keepShopping= scan.nextLine();
                keepShopping= keepShopping.toLowerCase();
                switch(keepShopping)
                {
                    case "y": 
                        valid =1;
                        break;
                    case "n":
                        valid=1;
                        break;
                    default:
                        System.out.println("Sorry, didn't understand that, try again.");
                        break;
                }
            } 
            valid = 0;
            
        }
        System.out.println("Please pay: " + cart.getTotalPrice());
    }

}
