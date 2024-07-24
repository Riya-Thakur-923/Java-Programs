import java.util.Scanner;
public class Class1{
     static int fact(int n){
          if(n==0 || n==1)
          {
               return 1;
          }
          else{
               return n * fact(n-1);
          }
     }
     public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          int a = in.nextInt();
          
          System.out.println("Factorial of " +a+ " is " +fact(a));
     }
}