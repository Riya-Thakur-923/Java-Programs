
public class Loop{
	public static void main(String[] args){
						
			int n = 5;
			int i=1;
			int factorial = 1;
			
		  while(i<=n)
		  {
		  	factorial *= i;
		  	i++;
		  }
		  System.out.println(factorial);
		
	}
} 
//factorial of n= n-0 * n-1 * n-2 * n-3 *..* n-(n-1) 
// factorial symbol !
//5! = 5*4*3*2*1
