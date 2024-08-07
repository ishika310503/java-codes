package patterns;

public class hollow_rhombu {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }

            for(j=0;j<n;j++)
            {
                if( j==0 || j==n-1 || i==0 || i==n-1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
