  // take multiple inputs and print with do while loop
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] name=new String[5];
        int i=0; int j=0;
        Scanner inputname=new Scanner(System.in);
        System.out.println("Please enter your five name: ");

        do{  
            name[i]=inputname.nextLine();
            i++;
        }while(i<5);  

        System.out.println("The name are: ");

        do{  
            System.out.println(name[j]);
            j++;
        }while(j<5); 
    }
}
  
  
  
  // take multiple inputs and print with while loop
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         String [] name=new String[5];
//         int i=0; int j=0;
//         Scanner inputname=new Scanner(System.in);
//         System.out.println("Please enter your five name: ");
//         while(i<5){
//             name[i]=inputname.nextLine();
//             i++;
//         }
//         System.out.println("The name are: ");
//         while(j<5){
//             System.out.println(name[j]);
//             j++;
//         }

//     }
// }



        // simple while loop example
// public class Main {  
//     public static void main(String[] args) {  
//         int i=1;  
//         while(i<=10){  
//             System.out.println(i);  
//         i++;  
//         }  
//     }  
//     }  