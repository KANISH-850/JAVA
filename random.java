import java.util.*;
import java.util.Random;
public class Main{
    public static void main(String[] args){
        Random a=new Random();
        int newnu=0;
        
        while(newnu!=5){
            newnu=a.nextInt(18);
            System.out.println(newnu);
        }
    }
}
