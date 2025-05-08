import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args)
    {
        Scanner b=new Scanner(System.in);
        int num=b.nextInt();
        int num2=b.nextInt();
        int num3=b.nextInt();
        double num4=(num2*num2)-(4*num*num3);
        num4= Math.sqrt(num4);
        double num5=(-num2-num4)/(2*num);
        double num6=(-num2+num4)/(2*num);
        System.out.printf("%.10f\n",num5);
        System.out.printf("%.10f",num6);
    }
}
