package patterns;

public class half_pyramid
{
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=n;i>=1;i--)
        {

            for(j=i;j>=1;j--)
            {
                System.out.print((n+1-i)+ " ");
            }
            System.out.println();
        }
    }
}
