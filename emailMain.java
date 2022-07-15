import java.util.*;
import java.util.Scanner;

public class emailMain
{
    public static void main (String [] args)
    {
        // new scanner for user input
        Scanner input = new Scanner(System.in); // this creates a scanner object
        System.out.println(" What is your first  name?");
        String first = input.nextLine();
        System.out.println("What is your last name?");
        String last = input.nextLine();
        // Create a email object
        emailInfo firstEmail = new emailInfo(first,last);
        System.out.println(firstEmail.getMailBoxCapacity());
    }
}
