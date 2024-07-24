import java.util.Scanner;

public class ClassName{
     public static void main(String[]args){
          
          Scanner in = new Scanner(System.in);
          
          System.out.println("Hii! What's your name?");
          String yourName = in.nextLine();
          
          System.out.println("Hello " +yourName+ ". Nice to meet you!");
          
     }
}