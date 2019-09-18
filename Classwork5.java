
public class Classwork5
{
   public static void main(String[] args)
   {
         
           // Math.random() outputs numbers from 0 to .99999999999
           // Multiplying math.random() by 5 gives us 0 to 5.9999999999
           // Casting this result gives us numbers from 0 to 5
           // Adding 1 to the data gives numbers from 1 to 6
           double dice1 =(int)(Math.random() * 6) + 1;
           double dice2 =(int)(Math.random() * 6) + 1;
           double sum = dice1 + dice2;
           
           if (sum == 7 ||sum == 11)
           {System.out.println("You win!");}
           else if (sum == 2 || sum == 3 || sum ==12)
           {System.out.println("You lose!");}
           else
           {System.out.println("Keep playing!");}
           
        
        
   }
}

