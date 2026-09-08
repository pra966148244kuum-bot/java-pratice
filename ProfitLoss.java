import java.util.Scanner;
public class ProfitLoss {
    public static void main (String[]args) {
       Scanner sc = new Scanner(System.in);
     System.out.println("Enter a cp: ");
     int cp = sc.nextInt();  // Cost price
     System.out.println("Enter a sp: ");
     int sp = sc.nextInt();  // Selling price
     if (sp > cp)
        System.out.println("Profit is "+(sp - cp));
     
     if (cp > sp)
        System.out.println("Loss is "+(cp - sp));
     
      if (cp == sp)
        System.out.println("No Profit No Loss");
      

    }

    
}
