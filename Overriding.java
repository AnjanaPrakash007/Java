
class Shape
{
    String name;
    Shape(String name)
    {
        this.name=name;
    }
    void show()
    {
        System.out.println("shape" +this.name);
    }
    void findarea()
    {
        System.out.println("No area");
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
    void findarea()
    {
        System.out.println(this.length*this.breadth);
    }
    void show()
    {
        System.out.println("Rectangle" +this.name);
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
    void findarea()
    {
        System.out.println(3.14*this.radius*this.radius);
    }
    void show()
    {
        System.out.println("Circle" +this.radius);
    }
}
class Overriding
{
    public static void main(String[] args)
    {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Shape("shape");
        shapes[1]=new Rectangle(10,10,"Rectangle");
        shapes[2]=new Circle(10,"circle");
        for (Shape s:shapes)
        {
            s.show();
            s.findarea();
        }
        
        
    }
}

