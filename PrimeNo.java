import java.util.Scanner;
public class PrimeNo{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
				//by count method	 :--
/*
If user input 'num' is a prime no 
the control will enter inside if statement 2 times only
1.when i is 1, num%1==0 then count++ (1)
2.when i is num,num%num==0 then count++ (2)

If user input 'num' is not a prime no
the control will enter inside if statement more than 2 times
*/		
		int num = in.nextInt();
		int count = 0;
		
		for(int i=1; i<=num; i++)
		{
			 if(num%i==0){//at i==1 & i==num if prime
				  count++;
			 }
		}
		
		if(count==2){
		  	System.out.println(num+" is a prime number!");
		}
		
		else{//count>2
		  	System.out.println(num+" is not a prime number!");
		}
		
		
		
		
		//by string method :--
		int num = in.nextInt();
		String prime = " is a prime number!";
		for(int i=2; i<num; i++)
		{
				if(num%i==0){
					prime= prime.replace(" is a prime number!"," is not a prime number!");
  				break;
				}
		}
		System.out.println(num+prime);
		
		
		
		
		//by boolean method :--
   int num = in.nextInt();
		boolean prime = true;
			for(int i=2; i<num; i++)
			{
				if(num%i==0){
					prime= false;
  				break;
				}
			}
		System.out.println(prime);
	 
	}
}
