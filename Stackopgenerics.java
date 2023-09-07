import java.util.*;
class Stack<T>
{
    private ArrayList <T> s;  
    private int top;
    Stack()
    {
        s=new ArrayList<T>();
        top=-1;
    }
    public void push(T item)
    {
       s.add(item);
       top++; 
    }
    public T pop()
    {
       if(top==-1)
       {
           System.out.println("stack empty");
           return null;
       }
       top--;
       return s.get(top);
    }
    public void display()
    {
        System.out.println("current stack");
        for(int i=top;i>=0;i--)
        {
            System.out.println(s.get(i));
        }
    }
}
class Stackopgenerics
{   
    public static void main(String[] args)
    {
        Stack<Integer> s1= new Stack <Integer>();
        s1.push(11);
        s1.push(22);
        s1.push(33);
        s1.pop();
        s1.push(20);
        s1.display();
        Stack<Double> s2=new Stack <Double>();
        s2.push(11.2);
        s2.push(88.5);
        s2.push(78.9);
        s2.pop();
        s2.display();
    }
}
