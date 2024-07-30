package method1;

public class p5 {
    // 9. temp convert  f=c*9/5 +32
    static float convert(float c)
    {
        return (c*(9.0f/5.0f))+32;
    }
    public static void main(String[] args)
    {
        float f=convert(8);
        System.out.println("f="+f);
    }
}

