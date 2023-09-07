class Shape
{
    String name;
    Shape(String name)
    {
        this.name=name;
    }
    void show()
    {
        System.out.println("shape"+this.name);
    }
    void findarea()
    {
        System.out.println("no area");
    }
}
class Rectangle extends Shape
{
    private int length, breadth;
    Rectangle(int l,int b,String name)
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
        System.out.println("Rectangle"+this.name);
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
        System.out.println("circle"+this.name);
    }
}
class Ovrd
{
    public static void main(String[] args)
    {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Shape("shape 1");
        shapes[1]=new Rectangle(10,20,"r1");
        shapes[2]=new Circle(10,"c1");
        for(Shape s:shapes)
        {
            s.show();
            s.findarea();
        }
    }
}
