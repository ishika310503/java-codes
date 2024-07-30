package method1;

public class p2 {
    // 3.sum of n numbers
    static int sum(int n)
    {
        if(n==1) {
            return 1;
        }
            return n + sum(n-1);
    }
    public static void main(String[] args)
    {
        int c=sum(3);
        System.out.println("sum ="+c);
    }
}
