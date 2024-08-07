package recursion;

public class recursion34 {


   static int fibonacci(int n)
   {

       if(n==0)
       {
           return 0;
       }
       else if (n==1)
       {
           return 1;
       }
       else {
           return fibonacci(n-1)+fibonacci(n-2);

   }}
          public static void main(String[] args)
   {
       int x=6;
      // for(int i=0;i<x;i++)
       System.out.println("fibonacci series is="+fibonacci(x));
   }
}
