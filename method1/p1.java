package method1;
public class p1 {
    //2. pattern
    static void pat(int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pat(5);
    }
}
