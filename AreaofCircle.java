class Main
{
    static double findArea(double radius)
    {
        
        double area = 3.14*radius*radius;
        return (area);

    }


    public static void main(String args[])
    {
        double result=findArea(4.0);
        System.out.println(result);
    }
}