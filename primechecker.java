import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner (System.in);
        int n=a.nextInt();
        int i=0;
        int count=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count>2)
        System.out.print("The number " + n +" is not prime");
        else
        System.out.print("The number " + n +" is  prime");
    }
}
