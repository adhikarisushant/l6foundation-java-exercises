 import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) 
  {
    Scanner input = new Scanner (System.in);      
        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.print("Input your age: ");
        int age = input.nextInt();
        System.out.print("Input your contact number");
        BigInteger contact = input.nextBigInteger();
        System.out.println();
        System.out.println("Name " + name + "Age " + age + "Contact Number " + contact);
  }
}
