package patterns;

public class rhombus {
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
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
