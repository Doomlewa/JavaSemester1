package lab6q3;
import java.util.ArrayList; 
import java.util.Scanner;
import java.text.NumberFormat;
public class Shop {

    public static void main (String[] args)    { 
        ArrayList<Item> cart=new ArrayList<Item>();
        Item item; 
        String itemName; 
        double itemPrice; 
        double totalPrice=0;
        int quantity; 
        NumberFormat fmt= NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in); 
        String keepShopping = "y"; 
        do { 
            totalPrice=0;
            System.out.print ("Enter the name of the item: "); 
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: "); 
            itemPrice = scan.nextDouble(); 
            System.out.print ("Enter the quantity: "); 
            quantity = scan.nextInt();
            scan.nextLine();
            item=new Item(itemName,itemPrice,quantity);
            cart.add(item);
            System.out.println("\nYour cart currently looks like this:");
            for(int a=0;a<cart.size();a++)
            {
                item=cart.get(a);
                System.out.println(item.toString());
                totalPrice+=(item.getPrice()*item.getQuantity());
            }
            System.out.print ("Continue shopping (y/n)? "); 
            keepShopping = scan.nextLine();
           }
        while (keepShopping.equalsIgnoreCase("y"));
        scan.close();
            System.out.println("Your Total Comes out to " + fmt.format(totalPrice));

    }
}