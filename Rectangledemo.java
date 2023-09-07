class Rectangle
{
    int length;
    int breadth;//instancevariable
    Rectangle()
    {
        this.length=0;
        this.breadth=0;
    }
    Rectangle(int lenth,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    int getArea()
    {
        return (this.length * this.breadth);
    }
    int getPerimeter() 
    {
        return 2*(this.length+this.breadth);
    } 
}
class Rectangledemo
{
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle ();
        Rectangle r2=new Rectangle(10,20);
        System.out.println("Area of r1= "+ r1.getArea());
        System.out.println("Area of r2= "+ r2.getArea());
        System.out.println("perimeter of r2= "+r2.getPerimeter());
    }
}
