import java.util.Scanner;
public class Classwork4 // class header
{
  public static void main(String[] args)    // method header
  {
      Scanner scan = new Scanner(System.in);
      // Write a program that prompts a user for their name!
      System.out.println("What's your name");
      // Store the user's name using scan.nextLine()!
     
      String userName = scan.nextLine();
      
      if (userName.equals("Kelly") )
        System.out.println("Great name!");
      else if (userName.equals("kelly"))
        System.out.println("That name is okay.");
      else
        System.out.println("Okay, " + name + ". That's a name.");
      
      
    
      
      
  }
}





