import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input the first number: ");
    int a = input.nextInt();

    System.out.print("Input the second number: ");
    int b = input.nextInt();

    int add = (a+b);
    int sub = (a-b);
    int div = (a/b);   
    
    System.out.println("The calculation of a and b is:"+ "\n" +add + "\n" + sub + "\n" + div);
  }
}