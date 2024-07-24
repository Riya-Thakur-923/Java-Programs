import java.util.Scanner;
public class URL{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a website url: ");
		String web = in.nextLine();
		
		if(web.endsWith(".com")){
			System.out.println("It's a commercial website.");
		}
		else if(web.endsWith(".org")){
			System.out.println("It's an organizational website.");
		}
		else if(web.endsWith(".in")){
			System.out.println("It's an Indian website.");
		}
		
		
	}
}