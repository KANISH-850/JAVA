import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int flag=0;
       int b=a.nextInt();
       int c=a.nextInt();
       for(int i=b;i<=c;i++){
           if(i==1||i==0){
               continue;
           }
           flag=1;
           for(int j=2;j<i;++j){
               if (i%j==0){
                   flag=0;
                   break;
               }
           }
           if(flag==1){
               System.out.println(i);
           }
       }
    }
}
