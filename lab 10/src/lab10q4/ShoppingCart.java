package lab10q4;
import java.text.NumberFormat; 
public class ShoppingCart 
{ 
    private int itemCount;      // total number of items in the cart 
    private double totalPrice;  // total price of items in the cart 
    private int capacity;       // current cart capacity
    private Item[] cart;
    // --------------------------------------------------------- 
    //  Creates an empty shopping cart with a capacity of 5 items. 
    // --------------------------------------------------------- 
    public ShoppingCart() 
    { 
        capacity = 5; 
        itemCount = 0; 
        totalPrice = 0.0;
        cart = new Item[capacity];
    } 

    //----------------------------------------------------- 
    //  Adds an item to the shopping cart. 
    // ----------------------------------------------------- 
    public void addToCart(String itemName, double price, int quantity)
    { 
        Item temp = new Item(itemName, price, quantity);
        double objectPrice = price*quantity;
        cart[itemCount] = temp;
        itemCount++;
        totalPrice+=objectPrice;
        
        if (capacity - itemCount < 3)
        {
            increaseSize();
        }
        
    } 
    // ----------------------------------------------------- 
    //  Returns the contents of the cart together with 
    //  summary information.    
    //----------------------------------------------------- 
    public String toString() 
    { 
        NumberFormat fmt = NumberFormat.getCurrencyInstance(); 
        String contents = "\nShopping Cart\n"; 
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n"; 
        for (int i = 0; i < itemCount; i++) 
        {
            contents += cart[i].toString() + "\n"; 
        }
        contents += "\nTotal Price: " + fmt.format(totalPrice); 
        contents += "\n"; 
        return contents; 
    } 

    //----------------------------------------------------- 
    //   Increases the capacity of the shopping cart by 3 
    // ----------------------------------------------------- 
    private void increaseSize() 
    { 
        Item[] temp = new Item[capacity];
        for (int i=0; i<capacity;i++)
        {
            temp[i] = cart[i];
        }
        capacity+=3;
        cart = new Item[capacity];
        for (int i = 0;i<temp.length-1;i++)
        {
            cart[i]=temp[i];
        }
        
    }

    public String getTotalPrice() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return fmt.format(totalPrice);
    }
    
    
} 