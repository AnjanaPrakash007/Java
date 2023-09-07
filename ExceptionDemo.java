import java.util.Scanner;
class UnderageException extends Exception
{
    int age;
    UnderageException(int age)
    {
        this.age=age;
    }
    public String toString()
    {
        return "Your age is "+age+"years";
    }
}
class ExceptionDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        try
        {
            vote(age);
            System.out.println("enter 2 numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            double ans=a/b;
            System.out.println(a+ "/" +b+ "=" +ans);

        }
        catch(UnderageException e)
        {
            System.out.println("error" +e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("error" +e);
        }
        finally
        {
            System.out.println("exiting...Thank you");
        }  
    }
    static void vote(int age) throws UnderageException
    {
        if(age>=18)
        {
            System.out.println("welcome");
        }
        else
        {
            throw new UnderageException(age);
        }
    }
}

