// Imports go here
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.util.Random;
/*
This file will have all of the info for the customer

 */
//Parent class
public class Cust_info {
    // Info that user will be able to see
    // class attributes
    private  String firstName;
    private String lastName;

    private int  acct;

    // random object
    Random rand = new Random();

    // constructor
    public Cust_info(String first, String last)
    {
        this.firstName = first;
        this.lastName = last;
        // call random account function to give each new customer an account number
        randAcct();

    }

    // set  first name
    public void setFirst (String input )
    {
        this.firstName = input;
    }
    // set last name
    public void setLast ( String lastly)
    {
        this.lastName = lastly;
    }

    // MAke getters to acess the customer info
    public String getFirst()
    {
        return this.firstName;
    }
    public String getLast()
    {
        return this.lastName;
    }

    public int getAcct()
    {
        return acct;
    }




    // Get a string representation of the instance
    public String toString()
    {
        return "New Customer: " + this.firstName + ", " + this.lastName + acct;
    }
    public int randAcct ()
    {
        Random rnad = new Random();
        // this will give a random number that will be the account number
        acct = rnad.nextInt(99999999);
        return acct;
    }


}