class Stack
{   
    int top;
    int s[]= new int[10];
    Stack()
    {
        this.top=-1;
    }
    void push (int item)
    {
        if(top==9)
        {
            System.out.println("Stack is full");
        }
        else
        {
            s[++top]=item;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else
        {
            System.out.println(s[top--]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(s[i]);
            }
        }
    }
}
class StackDemo
{
    public static void main(String[] args)
    {
        Stack s1=new Stack();
        s1.push(11);
        s2.push(22);
        s3.push(33);
        s4.push(44);
        System.out.println("the stack elements are="+s1.display() );
        System.out.println("item popped="+s1.pop());
        
