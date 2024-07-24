public class Handling_Specific_Exceptions{
    public static void main(String[] args){
        
        int []arr = new int[3];
        arr[0] = 4;
        arr[1] = 8;
        arr[2] = 9;
        
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        int num = in.nextInt();
        
        try{
            System.out.println(arr[index]);
            System.out.println(arr[index]/num);
        }
        
        catch(Exception e1){
            System.out.println("Some other exception occurred" + e1);
        }
        
        catch(ArithmeticException e2){
            System.out.println("ArithmeticException occurred" + e2);
        }
        
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println("ArrayIndexOutOfBoundsException occurred" + e3);
        }
        
    }
}