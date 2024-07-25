import java.util.Scanner;
import java.util.Random;
public class exc2_rock
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 1 for rock , 2 for paper and 0 for scissor");

        int input=ob.nextInt();
        System.out.println("my choice is ="+input);
        Random random=new Random();
        int compinput=random.nextInt(3);

        if(input == compinput)
        {
            System.out.println("Draw");
        }
        else if(input == 1 && compinput == 0 || input == 2 && compinput == 1 || input==0&& compinput == 2)
        {
            System.out.println("You win");
        }
        else
        {
            System.out.println("Computer win");
        }
        System.out.println("Computer input="+ compinput);
    }
}
