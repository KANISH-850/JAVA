import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        double b=a.nextDouble();
        double c=a.nextDouble();
        if(b==c){
            System.out.print("Both are same");
        }
        else{
            System.out.print("Both are different");
        }
    }
}
