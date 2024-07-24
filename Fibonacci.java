public class Fibonacci{
    public static void main(String[] args){
        for(int i=0; i<=10; i++)
        {
            if(i==0 || i==1){
                continue;
            }
            i=(i-1) + (i-2);
        }
    }
}