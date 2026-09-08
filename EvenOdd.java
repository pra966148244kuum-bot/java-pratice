import java.util.Scanner;
public class EvenOdd {
     public static void main(String[]args) {
        // System.out.print("Enter a number:");
        // int x = 5;
        // if (x % 2 == 0)
        // System.out.print("Even number");
        // else
        // System.out.print("Odd number");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x % 2 == 0)
        System.out.println("Even number");
        else
        System.out.println("Odd number");


        



    }
}




