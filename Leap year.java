import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        if ((b%4==0)&&(b%100!=0||b%400==0)){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("Non Leap Year");
        }
    }
}
