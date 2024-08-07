package recursion;
public class fact {
       //  factorial
   static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
    public static void main(String[] args)
    {
        int x=5;
        System.out.println("Fcatorial of a no is ="+fact(x));
    }

}
