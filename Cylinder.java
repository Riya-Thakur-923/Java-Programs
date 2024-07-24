
class Cylinder{
    float radius;
    float height;
    float pi = 3.14f;
    
    //Constructors
    public Cylinder(float r, float h){
    	radius = r;
    	height = h;
    }
    
    /*Setters
    public void setRadius(float r){
        radius = r;
    }
    public void setHeight(float h){
        height = h;
    }
    */
    
    //Getters
    public float getSA(){
        return 2*pi*radius*height;
    }
    public float getTSA(){
        return 2*pi*radius*(height+radius);
    }
    public float getVolume(){
        return pi*radius*radius*height;
    }
}

public class Question1{
    public static void main(String[] args){
        
        Cylinder c = new Cylinder(4, 10);
        
        //c.setRadius(4);
        //c.setHeight(10);
        System.out.println(c.getSA());
        System.out.println(c.getTSA());
        System.out.println(c.getVolume());
    }
}