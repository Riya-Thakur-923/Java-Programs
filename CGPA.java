/*WAP to calculate CGPA using marks of three subjects (out of 100).*/

import java.util.Scanner;
public class FindCGPA{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the marks of first subject: ");
		float sub1 = scn.nextFloat();
		
		System.out.println("Enter the marks of second subject: ");
		float sub2 = scn.nextFloat();
		
		System.out.println("Enter the marks of third subject: ");
		float sub3 = scn.nextFloat();
		
		float total = sub1 + sub2 + sub3;
		System.out.println("Marks Obtained: " +total);
		
		float cgpa = total/30;
		System.out.println("CGPA: " +cgpa);
	}
}