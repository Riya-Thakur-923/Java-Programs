import java.util.Random;
import java.util.Scanner;

class Custom{
    int num;
    int userno;
    int guess;
    int b= false;
    
    Custom(){
        Random r = new Random(100);
        num = r.nextInt();
    }
    
    void takeInput(){
        Scanner in = new Scanner(System.in);
        userno = in.nextInt();
    }
    
    boolean isCorrect(){
        //b=true;
        //guess++;   
    }
    /*
    public void isSmall(){
        System.out.println("Wrong guess! The correct number is greater than " +userno);
        guess++;
    }
    public void isBig(){
            System.out.println("Wrong guess! The correct number is smaller than " +userno);
            guess++;
    }*/
}

public class Guess{
    public static void main(String[] args){
        Custom obj = new Custom();
        
        
        Scanner in = new Scanner(System.in);
        
        obj.num = r.nextInt();
        obj.userno = in.nextInt();
        
        if(userno==num){
            obj.isCorrect();
            System.out.println("Your score: " +guess);
        }
        if(userno<num){
            obj.isSmall();
        }
        if(userno>num){
            obj.isBig();
        }
    }
}    