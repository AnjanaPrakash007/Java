//interfaces
interface Istack
{
    void push();
    int pop();
    void display();
}
//classes
class Fixedstack implements Istack
{
    private int s[];
    private int top;
    Fixedstack(int size)
    {
        s=new int[size];
        int top=-1;
    }
    public void push(int item)
    {
        if(top=s.length-1)
        {
            System.out.println("stack is full");
        }
        else
        {
            s[++top]=item;
        }
    }
    public int pop()
    {
        if(top=-1)
        {
            System.out.println("stack is empty");
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
///class
class Dynamicstack implements Istack
{
     private int s[];
     private int top;
     Dynamicstack(int size)
     {
        s=new int[size];
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
            s[++top]=item;
        }
     }
     public int pop()
     {
        if(top=-1)
        {
            System.out.println("stack is empty");
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
class Stackoperation
{
    public static void main(String args)
    {
        Istack fs=new Fixedstack(3);
        Istack ds=new Dynamicstack(3);
        fs.push(11);
        fs.push(22);
        fs.push(33);
        fs.pop();
        fs.display();
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.pop();
        ds.display();

    }
}
