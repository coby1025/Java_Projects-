import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class emailInfo
{
    // make these private for encapsulation purposes
   private String firstName;
   private String dpt = "";
   private String lastName;
   private  String password;
   private String department;
   private int passwordLength = 10;
   private int mailBoxCapacity = 300;
   private  String altEmail;
   private String email = "";

   private String company = "neonella.com";


   // Create a scanner for prompting a user
   Scanner response = new Scanner (System.in);
// Make constructor to receive the first and last name
   public emailInfo(String first, String last )
   {
      this.firstName = first;
      this.lastName = last;

      // Want to call a method to ask for department
      this.department = askDepartment();

      // Want to call a method to set a random passoword
      this.password = randPass(passwordLength);

      // Combine elements to generate email
      email = firstName.toLowerCase() + "." +  lastName.toLowerCase() + "@" + dpt + "." + company;

      // Call a method to print all the info
      showCredentials();


   }

    // set mailbox capacity
   public int setMailBox(int cap)
   {
      // this will set the mailbox capacity
      this.mailBoxCapacity = cap;
      return cap;
   }

    // Generate a random password
   private  String randPass(int len)
   {
      // First you want to make a string of all possible characters
      String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
      // next you want to make an array of charcters because that is what a password is
      char [] randPass = new char[len]; // You want the array to have the len of the intger passed in
      // Iterate through the len and set the password
      for (int i = 0; i < len; i++)
      {
         // This will generate a number between 0 and 1 and multiply by the length of available characters
         int rando = (int) (Math.random() * passSet.length());

         //This will take the array at whatever index it is at and assign whatever
         // random character is generated from the available characters
         randPass[i] = passSet.charAt(rando);
      }
      return new String(randPass);


   }

   // Change password
   public void changePassword (String change)
   {
      this.password = change;
   }

    // set the alt email
   public String setAltEmail(String altMail )
   {
      // This will set the alternate email
      this.altEmail = altMail;

      return altMail;
   }

    // ask for the department
   private String  askDepartment( )
   {
      // Prompt user to tell department name
      System.out.println("What department are you in?");
      System.out.println("Enter 1 for sales, 2 for accounting, 3 for development, 0 for none");


      // save input as department
       int answer= response.nextInt();
      // This will set the depart
      if ( answer == 1)
      {
         dpt = "sales";
      }
      else if ( answer == 2)
      {
         dpt = " accounting";
      }
      else  if ( answer == 3)
      {
         dpt = "development";
      }
      else
      {
         dpt = " ";
      }

      return dpt;


   }
   // get mailbox capacity
   public int getMailBoxCapacity ()
   {
      return mailBoxCapacity;
   }
   // get email
   public String getEmail ()
   {
      return email;
   }

   // get name
   public String getName()
   {
      return firstName + lastName;
   }
   // get alt email
   public String getAltEmail()
   {
      return altEmail;
   }

   // get password
   public String getPassword()
   {
      return password;
   }

   // This will print all of the info
   public void  showCredentials()
   {
      System.out.println("Name: " + firstName +  " " + lastName);
      System.out.println("Email: " + email);
      System.out.println("Mailbox Capacity: " + mailBoxCapacity);
   }

}
