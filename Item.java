

public class Item
{
    private String name;
    private double price;
    private int quantity;
  

   
    public Item(String nm, double pr, int qn)
    {
        this.name=nm;
        this.price=pr;
        this.quantity=qn;
        
    }
    
    public String toString() {
        return "[Product] " + name + " | " + "[Price] " + price + " | " 
                + "[Quantity] " + quantity;
    }

   
}
