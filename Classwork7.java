import java.util.Scanner;
// 9/23/2019
public class Classwork7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Method call for findSum method
        //System.out.println(findSum(2, 3));
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println(canIVote(age));
        System.out.println("Are you being honest? What's your real age?");
        age = scan.nextInt();
        System.out.println(canIVote(age));
    }
    public static double findSum(int a, int b)
    {
        return a + b;
    }
    public static String canIVote(int age)
    {
        if (age >= 18)
            return "You can vote!";
        else
            return "You can't vote!";
    }
    public static String isBestNameEver(String name)
    {
        if(name.equals("Kelly") || name.equals("kelly"))
            return "That's the best name ever!";
        else
            return "Consider changing your name.";
    }
    
}
