/* WAP to detect whether a number entered by the user is integer or not. */

import java.util.Scanner;
public class intOrNot{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		boolean boo = scn.hasNextInt();
		System.out.println(boo);
		}
	}