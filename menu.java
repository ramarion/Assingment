/*                       ~~~~~  DISCLAIMER  ~~~~~~
 * MENU GETS TREATED AS A MAIN CLASS BECAUSE IT'S SIMPLER FOR ME TO PLUG EVERYTHING HERE.........
 * CODE MAY NOT WORK
 * TRIED MY BEST
 */

package robot;
import java.util.Scanner;
/**
 *
 * @author Ramario
 */
public class menu {

   
    public static void main(String[] args) {
        
        
        
        Scanner user_input = new Scanner(System.in);
        
    //Menu LIst
    System.out.println("**WELCOME TO SODA PALACE**");
    System.out.println("Soda Menu");
    System.out.println(" \n1.7up - 20 Oz ($160) \n2.Pepsi - 20 Oz ($160) \n3.Sprite 20 Oz ($160)");
    
    //accepts user input
    int order;
    System.out.print("Place your Order:");
    order = user_input.nextInt();
    
  
    
    //return choices 
    beverage p1 = new beverage();
    beverage p2 = new beverage();
    beverage p3 = new beverage();
    
    Customer p4 = new Customer();
    
    String comp_order;
    comp_order =   p1.getNum(); 
    comp_order =   p2.getNum1();
    comp_order =   p3.getNum2();
    System.out.println("You've chosen a: " + comp_order + "\n You are Customer No :" + p4.getCid() );
    
    
    
    
    

      }

}
