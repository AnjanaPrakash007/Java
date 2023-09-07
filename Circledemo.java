class Circle
{
    double radius;//inst var
    Circle()//constr
    {
       this.radius=0;
    }
    Circle(double radius)
    {
       this.radius=radius;
    }
    double getArea()
    {
        return (3.14* this.radius*this.radius);
    }
    double getPerimeter()
    {
        return (2*3.14*this.radius);
    }   
}
class Circledemo
{
    public static void main(String[] args)
    {
        Circle c1=new Circle();
        Circle c2=new Circle(10);
        System.out.println("area of the circle c1= "+c1.getArea());
        System.out.println("area of the circle c2= "+c2.getArea());
        System.out.println("perimeter of the circle c1= "+c1.getPerimeter());
        System.out.println("perimeter of the circle c2= "+c2.getPerimeter());
        
        
    }
}
