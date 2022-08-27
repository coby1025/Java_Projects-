// imports
import java.util.*;
import java.lang.Math;
import java.util.Scanner;
public class Bank_Info  extends Cust_info
{
    private int balance;
    private int added = 0;
    //private String first;
    //private String last;
    // create a new scanner
    Scanner howdy = new Scanner(System.in);
    // constructor
    public Bank_Info(int bal, String first, String last )
        {
            super(first,last);
            this.balance = bal;

        }
    // Create a String representation
    public String toString()
    {
        return ("Hello " + getFirst() + "your account balance is: " + this.balance);
    }




    // Make deposits
    public int deposit ()
    {
        // Prompt the user to ask how much they are adding
        System.out.println("Hello, please enter the amount you want to deposit: ");
        int amt = howdy.nextInt();
        this.balance += amt;
        return balance;
    }

    // Make a withdrawl
    public int withdrawl()
    {
        // Prompt user
        System.out.println("How much would you like to take out: ");
        int take = howdy.nextInt();
        if (take <= this.balance )
        {
            this.balance -= take;
        }
        else {
            System.out.println("The amount you requested is more than what " +
                    "your current account has available, " +
                    "please choose a different amount. ");
        }
        return this.balance;
    }

    // Get the balance
    public int getBalance()
    {
        return this.balance;
    }



}
