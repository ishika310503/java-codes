package conditionals;

import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter salary");
        long salary = ob.nextLong();
        float tax = 0;
        if (salary < 250000) {
            System.out.println("no tax");
        } else if (salary >= 250000 && salary < 500000) {
            tax = (5 * salary) / 100.0f;
            System.out.println(tax);
        } else if (salary >= 500000 && salary < 1000000) {
            tax = (20 * salary) / 100.0f;
            System.out.println(tax);
        } else {
            tax = (30 * salary) / 100.0f;
            System.out.println(tax);
        }
    }
}
