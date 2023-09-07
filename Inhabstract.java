abstract class Shape
{
    String name;
    Shape(String name)
    {
        this.name=name;
    }
    void show()
    {
        System.out.println(this.name);
    }
    abstract int getarea();
}
class Rectangle extends Shape
{
     private int length,breadth;
     Rectangle(int l,int b,String name)
     {
        super(name);
        this.length=l;
        this.breadth=b;
     }
     int getarea()
     {
        return this.length*this.breadth;
     }
 }
 class Inhabstract
 {
        public static void main(String[] args)
        {
           Rectangle r= new Rectangle(10,20,"r1");
           System.out.println("rectangle");
           r.show();
           System.out.println("area=  "+r.getarea()); 
        }
        
 }
