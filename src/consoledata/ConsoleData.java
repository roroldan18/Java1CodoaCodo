
package consoledata;
import java.util.Scanner;

public class ConsoleData {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter your First Name= ");
        String firstName = sc.nextLine();
        
        System.out.println("Enter your Last Name= ");
        String lastName = sc.nextLine();
        
        System.out.println("Enter your age= ");
        int age = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter your hobbie= ");
        String hobbie = sc.nextLine();
        
        System.out.println("Enter your preferred code editor = ");
        String prefEditor = sc.nextLine();
        
        System.out.println("Enter your operative system= ");
        String operativeSystem = sc.nextLine();
        
        
        System.out.println("Your First Name is: " + firstName);
        System.out.println("Your Last Name is: " + lastName);
        System.out.println("Your age is: " + age);
        System.out.println("Your hobbie is: " + hobbie);
        System.out.println("Your preferred code editor is: " + prefEditor);
        System.out.println("Your operative system is: " + operativeSystem);
        
    }
    
}
