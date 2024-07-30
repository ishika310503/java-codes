package method1;

public class p4 {
   //  5. fibonacci
static int fibo(int n)
{
    if(n==1)
    {
        return 0;
    }
    else if(n==2) {
        return 1;
    }
    else{
        return fibo(n-1)+fibo(n-2);
    }
}
public static void main(String[] args) {
int r=fibo(5);
    System.out.println("fibonacci="+r);
}
}

