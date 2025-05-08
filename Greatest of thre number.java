import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int c=a.nextInt();
        int d=a.nextInt();
        
        if(b>c && b>d)
        System.out.print(b+ "is Greater number");
        else if(c>d)
        System.out.print(c+ "is Greater number");
        else
        System.out.print(d+"is Greater number");
    }
}
