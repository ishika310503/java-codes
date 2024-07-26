package oops;
//perimeter and area of square using oops
class square
{
    int a;
    public int area()
    {
        return a*a;
    }
    public int perimeter()
    {
        return 4*a;
    }
}
public class oop39_2
{
    public static void main(String[] args)
    {
        square ob=new square();
        ob.a=5 ;
        System.out.println(ob.area());
        System.out.println(ob.perimeter());
    }
}