/* WAP to convert kilometres into miles */

import java.util.Scanner;
public class KmtoMiles{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the value in km: ");
		float xkm = scn.nextFloat();
		
		float xmiles = 621*xkm/1000;
		System.out.println("There are " +xmiles+ " miles in " +xkm+ " km.");
		
		}
	}