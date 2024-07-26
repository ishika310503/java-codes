package oops;
class rectangle
{
    int a,b;
    public int area()
    {
        return a*b;
    }
    public int perimeter()
    {
        return (2*(a+b));
    }
}
public class oop39_3
{
    public static void main(String[] args)
    {
        rectangle r=new rectangle();
        r.a=4 ;
        r.b=5;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}


