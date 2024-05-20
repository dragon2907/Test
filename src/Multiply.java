import java.util.Scanner;

public class Multiply {
    public  static void main(String[] args)
    {
        double a,b;
        Scanner in =new Scanner(System.in);
        System.out.print("a = "); a = in.nextDouble();
        System.out.print("b= " ); b = in.nextDouble();
        double p = 2*(a+b);
        System.out.println(p);
    }

}
