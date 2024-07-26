package oops;
class cellphone
{
    public void ringing() {
        System.out.println("ringing");
    }
    public void vibrating()
    {
        System.out.println("Vibrating");
    }
}
public class oop39_1
{
    public static void main(String[] args)
    {
        cellphone apple=new cellphone();
        apple.ringing();
        apple.vibrating();
    }}

