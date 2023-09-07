import java.util.Scanner;
class Product
{
	double a,b,c;
	Product()
	{
		this.a=0;
		this.b=0;
		this.c=0;
	}
	Product(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	Product(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	double getProduct(double a,double b)
	{
		return a*b;
	}
	double getProduct(double a,double b,double c)
	{
		return a*b*c;
	}
}
class Overloading
{
	public static void main(String[] args)
	{
        int choice;
        double a,b,c;
        Product p;
        System.out.println("1.product of 2 numbers:");
        System.out.println("2.product of 3 numbers:");
        System.out.println("enter your choice");
        Scanner sc= new Scanner(System.in);
        choice=sc.nextInt();
        switch(choice)
        {
              case 1:
                  System.out.println("enter 2 nums");
                  a=sc.nextDouble();
                  b=sc.nextDouble();
                  p= new Product(a,b);
                  System.out.println("product= "+p.getProduct(a,b));
              case 2:
                  System.out.println("enter 3nnums");
                  a=sc.nextDouble();
                  b=sc.nextDouble();
                  c=sc.nextDouble();
                  p= new Product(a,b,c);
                  System.out.println("product= "+p.getProduct(a,b,c));
        }
        
        
	}
}
