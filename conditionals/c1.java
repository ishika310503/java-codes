package conditionals;

import java.util.Scanner;

public class c1 {
    // probelm 5  leap year
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);


        System.out.println("Enter a year");
        int y = ob.nextInt();
        if (y % 4 == 0)
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }
}
