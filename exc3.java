import java.util.Random;
import java.util.Scanner;
public class exc3 {
    // create a game to guess the no
   int number;
   int noofguesses=0;
   int inputnumber;
    public void setNoofguesses(int noofguesses) {

        this.noofguesses = noofguesses;
    }
    public int getNoofguesses() {

        return noofguesses;
    }
     exc3()
    {
        Random r=new Random();
     this.number=r.nextInt(100);
    }
  public void input()
    {
        Scanner ob=new Scanner(System.in);
        inputnumber=ob.nextInt();

    }
   boolean isCorrectNumber()
    {
       noofguesses++;
        if(inputnumber==number)
        {
            System.out.format("you guesses it in %d attempts",noofguesses);
        return true;
        }
   else if(inputnumber<number){
       System.out.println("no is small");

        }
        else if(inputnumber>number) {

              System.out.println("no is greater");
        }
        return false;
    
    }
}
class game {
    public static void main(String[] args) {
        exc3 ob = new exc3();
        System.out.println("guess the  no entered between 1 to 100");
        boolean b = false;
        while (!b) {
            ob.input();
            b = ob.isCorrectNumber();

        }
    }
}