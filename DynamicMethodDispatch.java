class Parent{
    
    public void earn(){
        System.out.println("Hello!");
    }
    public void smile(){
        System.out.println("Hi! Im in Parent");
    }
    
}

class Child extends Parent{
    
    public void smile(){
        System.out.println("Hi! Im in Child");
    }
    public void study(){
        System.out.println("Tell me a story!");
    }
    
}

public class Dynamic_Method_Dispatch{
    public static void main(String[] args){
        
//Parent = reference
//object'obj' is created for Child class
//so,it'll call override method of child 
        Parent obj = new Child();
        obj.smile();//Im in child
        obj.earn();
        
      //obj.study();Error!
        
        
//You cannot write it in this way
      //Child obj2 = new Parent();ERROR!
    }
}