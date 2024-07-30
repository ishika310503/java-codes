import java.util.Scanner;
public class practice_4
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);


        //problem 1
        System.out.println("Enter the url");
        String url=ob.nextLine();
        if(url.endsWith(".com"))
            System.out.println("it is a commercial website");
        else if(url.endsWith(".in"))
            System.out.println("Indian website");
        else
            System.out.println("Invalid");
    }
}
