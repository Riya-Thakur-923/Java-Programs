public class MethodOverloading{
    
    static void method(int []arr){
        arr[0] = 98;
    }
    
    public static void main(String[] args){
        int []marks = {52, 73, 77, 89, 98, 94};
        method(marks);
        System.out.println("The first element of Array: " +marks[0]);
    }
    
}