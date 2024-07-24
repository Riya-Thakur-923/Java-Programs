
class Sphere{
    float radius;
    float pi = 3.14f;
    
    //Constructors
    public Sphere(float r){
    	radius = r;
    }
    
    /*Setters
    public void setRadius(float r){
        radius = r;
    }
    */
    
    //Getters
    public float getRadius(){
        return radius;
    }
    
    
    public float getSA(){
        return 4*pi*radius*radius;
    }
    
    public float getVolume(){
        return pi*radius*radius*radius;
    }
}

public class Question2{
    public static void main(String[] args){
        
        Sphere s = new Sphere(4);
        
        //s.setRadius(4);
        System.out.println(s.getSA());
        System.out.println(s.getVolume());
    }
}