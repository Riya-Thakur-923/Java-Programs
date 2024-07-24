class Custom{
    float radius;
    float cf;
    public void setRadius(float r){
        radius = r;
    }
    public void setCF(float c){
    	cf = c;
    }
    public float getCF(){
        return cf;
    }
}

public class Question1{
    public static void main(String[] args){
        Custom obj = new Custom();
        obj.setRadius(2.5f);
        obj.setCF(2*3.14f*2.5f);
        System.out.println(obj.getCF());
    }
}