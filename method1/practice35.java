public class practice35 {

    // 1. print table of a no.
    static void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            int m=n*i;
            System.out.println(n + "*"+ i+" ="+m);
        }
    }
    public static void main(String[] args)
    {
       table(6);
    }

}