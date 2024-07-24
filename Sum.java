import java.util.Scanner;
class ClassName{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		float sub1, sub2, sub3, sub4, sub5, total, percent;
		
		sub1 = in.nextFloat();
		sub2 = in.nextFloat();
		sub3 = in.nextFloat();
		sub4 = in.nextFloat();
		sub5 = in.nextFloat();
		
		total = sub1+sub2+sub3+sub4+sub5;
		percent = (total/500)*100;
		
		System.out.println(percent);
	}
}
