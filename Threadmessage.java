class Messagethread extends Thread
{
    String message;
    int timer;
    String name;
    Messagethread(String name,String name,int timer)
    {
        
        super(name);
        this.name=name;
        this.message=message;
        this.timer=timer;
    }
    public void run()
    {
       try
       {
          for(int i=0;i<5;i++)
          {
            System.out.println(this.message);
            Thread.sleep(this.timer);
          }  
       } 
    
