import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    ArrayList cart=new ArrayList();
    Scanner sc=new Scanner(System.in);
    public void buyItem() {
        System.out.println("Enter the name of the product");
        String name=sc.next();
        System.out.println("Enter the price");
        double price=sc.nextDouble();
        System.out.println("Enter the quantity");
        int quantity=sc.nextInt();
        Item item= new Item(name, price, quantity);
        cart.add(item);
    }
    
    public void continueShopping() {
        System.out.println("Continue shopping? y/n");
        String answer=sc.next();
        if(answer.equals("y")) {
            buyItem();
        }
        System.out.println(cart);
    }
}