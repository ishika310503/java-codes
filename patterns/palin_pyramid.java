package patterns;

public class palin_pyramid {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for( j=i; j>=1; j--) {
                System.out.print(j);
            }


            //second part
            for( j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
