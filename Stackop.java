import java.util.Scanner;

interface Istack
{
	void push(int item);
	int pop();
	void display();
}
class Fixedstack implements Istack
{
	private int s[];
	private int top;
	Fixedstack(int size)
	{
		s=new int[size];
		top=-1;
	}
	public void push(int item)
	{
		if(top==s.length-1)
		{
			System.out.println("Stack full");
		}
		else
		{
			s[++top]=item;
		}
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("stack empty");
			return 0;
		}
		else
		{
			return s[top--];
		}
	}
	public void display()
	{
		System.out.println("current stack\n");
		for(int i=top;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
class dynamicstack implements Istack
{
	private int top;
	private int s[];
	dynamicstack(int size)
	{
		s=new int [size];
		top=-1;
	}
	public void push(int item)
	{
		if(top==s.length-1)
		{
			int temp[]=new int[s.length*2];
			for(int i=0;i<s.length;i++)
			{
				temp[i]=s[i];
				s=temp;
			}
		}
		s[++top]=item;
	}
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("stack empty");
			return 0;
		}
		else
		{
			return s[top--];
		}
	}
	public void display()
	{
		System.out.println("current stack");
		for(int i=top;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
class Stackop
{
	public static void main(String[] args)
	{

		Istack s=null;
		System.out.println("1.Fixedstack");
		System.out.println("2.Dynamicstack");
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Entre the size");
			int size=sc.nextInt();
			s=new Fixedstack(size);
			break;
		case 2:
			s=new dynamicstack(5);
			break;
		default:
			System.out.println("invalid");
		}
		int choice1;
		do
		{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.println("4.enter your choice");
			choice1=sc.nextInt();
			switch(choice1)
			{
				case 1:
					System.out.println("enter the item to be pushed:");
					int item=sc.nextInt();
					s.push(item);
					break;
				case 2:
					s.pop();
					break;
				case 3:
					s.display();
					break;
				case 4:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("invalid choice");
			}
			
		}while(choice1 != 4);
	}
}
