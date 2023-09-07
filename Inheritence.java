class Shape
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
}
class Rectangle extends Shape
{
    private int length,breadth;
    Rectangle(int length,int breadth,String name)
    {   
        super(name);
        this.length=l;
        this.breadth=b;
    }
    int getarea(int length,int breadth)
    {
        return this.length*this.breadth;
    } 
}
class Circle extends Shape
{
    private int radius;
    Circle(int radius,String name)
    {
        super(name);
        this.radius=r;

    }
    int getarea(this.radius)
    {
        return 3.14*this.radius*this.radius;
    }
}
class Cylinder extends Circle
{
    private int height
    Cylinder(this.radius)
    {
        super(r,name);
        this.height=h;
    }
    int getvolume(this.radius,this.height)
    {
        int volume;
        volume=getarea()*height;
        return volume;
    }
}
class Inheritance
{
    public static void main(String[] args)
    {
        Rectangle r1= new Rectangle(12,5,"r1");
        Circle c1=new Circle(10,"c1");
        Cylinder cy1= new Cylinder(10,4,"cy1");
        System.out.println("Rectangle");
        r1.show();
        System.out.println("Area= "+r1.getarea());
        System.out.println("Circle");
        c1.show();
        System.out.println("Area = "+c1.getarea())
        System.out.println("Cylinder");
        cy1.show();
        System.out.println("Area= "+cy1.getvolume())
    }
}
