// imports
import java.util.Scanner;
import java.util.*;

public class main
{
    // Main method
    public static void main(String[] args)
    {
        /*
        This is where the code will be ran
         */
        // create a scanner
        Scanner input = new Scanner(System.in);

        //prompt the user
        System.out.println("Welcome to A-Bank!, Please enter your first name ");
        // Enter first name
        String first_name = input.nextLine();

        System.out.println(" Please enter your lastname: ");
        // enters last name
        String last_name = input.nextLine();

        System.out.println("Please enter the amount you want to start with: ");
        int initial = input.nextInt();

        // Create  a customer with info given
        Cust_info cust1 = new Cust_info(first_name, last_name);
        // Create bank info
        Bank_Info first_banker = new Bank_Info(initial, first_name,last_name);


        // Show customer info
        System.out.println("Hello " + cust1.getFirst() + ", " + cust1.getLast() + ", here is your account number: "
        + cust1.getAcct() + ", your starting balance is: " + first_banker.getBalance());


    }

}
