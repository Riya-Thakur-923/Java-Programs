/*Here, method variables x and y takes the copy of values from main variables a and b, apply the values in the operation and then returns the resultant z to main variable c*/
public class ClassMethod{
    
	//Java Method Function
	static void method(int x, int y){
		int z;
		if(x>y){
			z = x+y;
		}
		else{
			z = (x+y) * 5;
		}
		return z;
	}
	
	
	//Java Main Function
	public static void main(String[] args){
		int a = 5;
		int b = 7;
		int c = method(a,b);
		
		System.out.println(c);
	}
	
}