import java.util.Scanner;
public class ClassName{
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter the year: ");
		int year = in.nextInt();
		
		if(year%4==0){
			System.out.println("It's a leap year");
		}
		else{
			System.out.println("It's not a leap year");
		}
	}
}
