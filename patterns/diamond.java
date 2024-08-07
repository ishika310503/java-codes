package patterns;

public class diamond {

    public static void main(String[] args) {
        int i,j;
        int n=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for( j=i; j>=1; j--) {
                System.out.print("*");
            }


            //second part
            for( j=2; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        //lower
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for( j=i; j>=1; j--) {
                System.out.print("*");
            }


            //second part
            for( j=2; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
