package conditionals;

import java.util.Scanner;

public class c4 {
    //problem 2
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your marks in sub1");
        int sub1 = ob.nextInt();
        System.out.println("Enter your marks in sub2");
        int sub2 = ob.nextInt();
        System.out.println("Enter your marks in sub3");
        int sub3 = ob.nextInt();
        float avg = (sub1 + sub2 + sub3) / 3.0f;
        System.out.println("overall percentage is =" + avg);
        if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("You have passed");
        } else {
            System.out.println("you have failed");
        }
    }
}
