import java.util.Scanner;
public class Class_Name{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		float tax = 0;
		float income = in.nextFloat();
		
		
		if(income<=2.5f){
			tax = tax + 0;
		}
		
		else if(income>2.5f && income<=5.0f){
			tax = tax + 0.05f * (income - 2.5f);
		}
		
		else if(income>5.0f && income<=10.0f){
			tax = tax + 0.05f * (5.0f-2.5f);
			tax = tax + 0.2f  * (income-5.0f);
		}
		
		else if(income>10.0f){
			tax = tax + 0.05f * (5.0f-2.5f);
			tax = tax + 0.2f  * (10.0f-5.0f);
			tax = tax + 0.3f  * (income-10.0f);
		}
		System.out.println("Total tax paid: " +tax);
		
	}
}