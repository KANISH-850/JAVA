import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner aq=new Scanner(System.in);
        String input =aq.nextLine();
        char b;
        if(input.length()>0){
            b=input.charAt(0);
        
        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U'){
            System.out.print("Vowel");
        }
        else{
            System.out.print("Consonant");
        
        }
        }
    }
}
