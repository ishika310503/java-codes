package conditionals;

import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        //probelm 4
        System.out.println("Enter day");
        int day = ob.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
        }
    }
}

