public class Try_Catch{
    public static void main(String[] args){
        
        int a = 5;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Sorry! It's an error because : " + e);
        }
        
    }
}