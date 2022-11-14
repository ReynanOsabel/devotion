//Osabel Reynan L.
//BsInd Tech 4 Devotion

package hardcoding;
import java.util.Scanner;

public class Main{

  public static void main(String[]args) {
  
  Scanner console = new Scanner(System.in);
  
  
  String orderCart = "Your orders are the following: \n";
  int respondToOrder, orderCategory;
  float totalPayment = 0, customerCash;
  
  System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
  System.out.println("| DO YOU WANT TO ORDER? [1-YES, 2-NO]            |");
  System.out.println("| Enter the number for your choice below         |");
  System.out.println("==================================================");
  System.out.print  ("Choice:");
  respondToOrder = console.nextInt(); 
  
  do {

  if (respondToOrder == 1) {
  
	  System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	  System.out.println("|WHAT TO ORDER? [1-FOOD, 2 - BEVERAGES , 3-SNACKS|");
	  System.out.println("| Enter the number for your choice below         |");
	  System.out.println("==================================================");
	  System.out.print  ("Choice:");
	  orderCategory = console.nextInt();
	  
	  if(orderCategory == 1) {
	    System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	    System.out.println("|***************ORDER FOOD***********************|");
	    System.out.println("| [1] Chicken  : P350.00   |");
	    System.out.println("| [2] Humberger:  P180.00   |");
	    System.out.println("| [3] Ramen:     P180.00   |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    float Chicken = 350 , Humberger = 180, Ramen = 180;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Chicken:       P350.00 added to cart");
		  totalPayment+=Chicken;
		  String order1 = "Chicken P350.00 \n";
		  orderCart+=order1;
		  
		break;
		
		case 2: 
		  System.out.println("Humberger:        P 180   : P180.00  added to cart");
		  totalPayment+=Humberger;
		  String order2 = "Humberger  P180.00  \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Ramen: P180.00 added to cart");
		  totalPayment+=Ramen;
		  String order3 = "Ramen      : P180.00 \n";
		  orderCart+=order3;
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    

	  } else if(orderCategory == 2) {
	    System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	    System.out.println("|***************ORDER BEVERAGE********************|");
	    System.out.println("| [1] 1Imperador Light : P130.00    |");
	    System.out.println("| [2] 1-Tower of Beer na Beer Pilsen : P280.00    |");
	    System.out.println("| [3] Kulafu Special for Cult Members: P180.00    |");
	    System.out.println("| Enter the number for your choice below          |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float Imperador= 130 , Gsm = 250, kulafu = 180;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("1- Imperador Light : P130.00 added to cart");
		  totalPayment+=Imperador;
		  String order1 = "1-Imperador Light : P130.00 \n";
		  orderCart+=order1;
		  
		  
		  
		  
		break;
		
		case 2: 
		  System.out.println("1- Gsm blue : P250.00 added to cart");
		  totalPayment+=Gsm;
		  String order2 = "1-Gsm blue : P250.00 \n";
		  orderCart+=order2;
		  
		  
		  
		break;
		
		case 3: 
		  System.out.println("Kulafu Special for Cult Members: P180.00  added to cart");
		  totalPayment+=kulafu;
		  String order3 = "Kulafu Special for Cult Members: P180.00 \n";
		  orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
	       break;  
	      
	      }
	    
	    
	    }
	    
	    else if(orderCategory == 3) {
	    System.out.println("==========WELCOME TO MANG KULAFS TAGAYAN! ========");
	    System.out.println("|*************ORDER SNACKS / PULUTAN*************|");
	    System.out.println("| [1] Hotdog in a plate       : P160.00    |");
	    System.out.println("| [2] Chicharon Dragon Skin            : P180.00    |");
	    System.out.println("| [3] Kropek Vegatarian Special     : P120.00    |");
	    System.out.println("| Enter the number for your choice below         |");
	    System.out.println("==================================================");
	    System.out.print  ("Choice:");
	    
	    float Hotdog = 160 , Chicharon = 150,          Fishcracker = 120;
	    int orderChoice = console.nextInt();
	    
	      switch (orderChoice) {
		case 1: 
		  System.out.println("Hotdog in a plate       : P160.00 added to cart");
		  totalPayment+=Hotdog;
		  String order1 = "Hotdog in a plate       : P160.00 \n";
		  orderCart+=order1;
		break;
		
		case 2: 
		  System.out.println("Chicharon DragonnSkin: P150.00 added to cart");
		  totalPayment+=Chicharon;
		  String order2 = "Chicharon Skin: P150.00 \n";
		  orderCart+=order2;
		break;
		
		case 3: 
		  System.out.println("Fish Cracker     : P120.00  added to cart");
		  totalPayment+=Fishcracker;
		   String order3 = "Fish Cracker     : P120.00 \n";
		   orderCart+=order3;
		  
		  
		break;
	      
	       default:
		 System.out.println("Enter valid entry only base on the choices above!");
		 
	       break;  
	      
	      }
	    
	    }
   }
   
   else {
   
   System.out.println("Okay! Have a nice day!~ ;)");
   System.exit(0);
   
   
   }
   
   
   
   
   System.out.println("Order again?");
   System.out.println("[1] - Yes");
   System.out.println("[2] - No");
   respondToOrder = console.nextInt();
   
    
  } while(respondToOrder == 1);
  
    System.out.println("Amount to pay: "+totalPayment);
    System.out.print("Enter cash payment: ");
    customerCash = console.nextFloat();
  
    System.out.println("==========R E C E I P T ========");
    System.out.println(orderCart);
     System.out.printf("TOTAL: %.2f\n",totalPayment);
    System.out.println("Change: " + (customerCash - totalPayment));
    System.out.println("================================");
     System.out.println("Thank you come again!");
  
  
  
  
  

  }


}