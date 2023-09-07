
//write a java prgm to find area,perimeter of rectangle
class Rectangle
{   
    double length;//inst var
    double breadth;
    Rectangle()//cnstr
    {
        this.length=0;
        this.breadth=0;
    }
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    double getArea()
    {
        return (this.length*this.breadth);
    }
    double getPerimeter()
    {
        return 2*(this.length+this.breadth);
    }
}
class Rectangledemo1
{ 
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle(10,20);
        System.out.println("ARea of rectangle= "+r1.getArea());
        System.out.println("Perimeter of rectangle = "+r1.getPerimeter());
    }  


}

