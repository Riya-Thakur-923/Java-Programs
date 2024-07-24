class Custom{
    private int id;
    private String name;
    private int year;
    
    //Constructor
    public Custom(){
    	id = 55;
    	name = "Riya";
    	year = 2003;
    }
    
    /*Setters
    public void setId(int i){
      id = i;
    }
    public void setName(String n){
    	name = n;
    }
    */
    	
    //Getters
    public int getId(){
      return id;
    }
    public String getName(){
      return name;
    }
    public int getYear(){
      return year;
    }
    
}

public class Question1{
    public static void main(String[] args){
        Custom obj = new Custom();
        //obj.setId(56);
        //obj.setName("Harry");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getYear());
    }
}
