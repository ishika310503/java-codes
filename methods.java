public class methods {
     int sum(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        methods m1=new methods();
     int a1 = 3;
        int b1 = 2;
        int c1=m1.sum(a1,b1);
        System.out.println(c1);
    }
}