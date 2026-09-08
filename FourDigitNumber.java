  // and/ && ke leya hai  Multiple Condition
import java.util.Scanner;
public class FourDigitNumber {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // if (n > 999 && n < 10000)
        //     System.out.println("4 Digit number");
        // else
        //     System.out.println(" Not 4 Digit number");

               // or/ || ke leya hai

         int n = sc.nextInt();
          if (n % 5 == 0 || n % 3 == 0)
            System.out.println("Divisibal by 5 or 3");
          else
            System.out.println("Not Divisibal by 5 or 3");

    }
}
