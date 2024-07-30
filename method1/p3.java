package method1;
public class p3 {
  //   4. pattern
static void pat(int n) {
    for (int i = 0; i < n; i++)
    {
        for(int j=(n-1);j>i;j--)
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

