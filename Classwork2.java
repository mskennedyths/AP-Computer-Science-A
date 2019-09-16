import java.util.Scanner;

public class Classwork2
{
    public static void main(String[] args)
    {
        // Step 1: Construct a Scanner object for reading keyboard input
        Scanner scan = new Scanner(System.in);
        
        // Step 2: Give the user a prompt with a print statement
        System.out.println("Enter your age:");
        
        // Step 3: declare a variable to store user input and use scan.nextDouble() to read the input
        double users_age = scan.nextDouble();
        
        double ms_kennedys_age = 36;
        
        double age_comparison = ms_kennedys_age/users_age;
        
        System.out.println("Ms. Kennedy is " + age_comparison + " times your age");
        
        // Copy Steps 1-3 above, and user them to generate a new program that outputs mathematical data
        
    }
}
