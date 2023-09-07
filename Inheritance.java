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
    private double length,breadth;
    Rectangle(double l,double b,String name)
    {   
        super(name);
        this.length=l;
        this.breadth=b;
    }
    double getarea()
    {
        return this.length*this.breadth;
    } 
}
class Circle extends Shape
{
    private double radius;
    Circle(double r,String name)
    {
        super(name);
        this.radius=r;

    }
    double getarea()
    {
        return 3.14*this.radius*this.radius;
    }
}
class Cylinder extends Circle
{
    private double height;
    Cylinder(double r,double h,String name)
    {
        super(r,name);
        this.height=h;
    }
    double getvolume()
    {
        double volume;
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
        System.out.println("Area = "+c1.getarea());
        System.out.println("Cylinder");
        cy1.show();
        System.out.println("Area= "+cy1.getvolume());
    }
}
