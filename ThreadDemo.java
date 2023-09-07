class Newthread implements Runnable
{
     Thread t;
     Newthread()
     {
        t=new Thread(this,"Demo thread");
        System.out.println("child thread:" +t);
        
     }
     public void run()
     {
        try
        {
           for(int i=5; i>=0;i--)
           {
               System.out.println("child thread" +i); 
               thread.sleep(1000);
           }
        }
        catch(InterruptedException e)
        {
               System.out.println("child interrupted");
        }
        System.out.println("Exiting Child Thread");
     }
}
class ThreadDemo
{
     public static void main(String[] args)
     {
         NewThread nt=new NewThread();
         nt.t.start();
         try
         {
            for(int i=5;i>=0;i--)
            {
                System.out.println("main thread"+i);
                Thread.sleep(2000);
            }
         }
         catch(InterruptedException e)
         {
            System.out.println("Main thread interrupted");
         }
         System.out.println("Exiting main thread ");
     }
}
