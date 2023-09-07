import java.util.Scanner;
class Triangle 
{
    double a,b,c;
    Triangle()
    {
        this.a=0;
        this.b=0;
        this.c=0;
    }
    Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    Triangle(double b)
    {
        this.b=b;
    }
    double getarea()
    {
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    double getarea(double h)
    {
        return 0.5*b*h;
    }
}
class TriangleOverload
{
    public static void main(String[] args)
    {
        int choice;
        double a,b,c,h;
        Triangle t;
        System.out.println("1.Triangle with 3 sides");
        System.out.println("2.Triangle with 2 sides");
        System.out.println("enter your choice:");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("enter the sides");
                a=sc.nextDouble();
                b=sc.nextDouble();
                c=sc.nextDouble();
                t=new Triangle(a,b,c);
                System.out.println("area= "+t.getarea());
                break;
            case 2:
                System.out.println("enter the base");
                b=sc.nextDouble();
                System.out.println("enter the height");
                h=sc.nextDouble();
                t=new Triangle(b);
                System.out.println("area= "+t.getarea(h));
                break;
            default:
                System.out.println("invalid choice");
                
                
        }
    }
    
}
