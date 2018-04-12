/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

/**
 *
 * @author aakansha
 */
class count implements Runnable
{
   Thread mythread ;
   count()
   { 
      mythread = new Thread(this, "my runnable thread");
      System.out.println("my thread created" + mythread);
      mythread.start();
   }
   public void run()
   {
      try
      {
        for (int i=0 ;i<10;i++)
        {
          System.out.println("Printing the count " + i);
          Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("mythread run is over" );
   }
}
class RunnableExample
{
    public static void main(String args[])
    {
       count cnt = new count();
       try
       {
          while(cnt.mythread.isAlive())
          {
            System.out.println("Main thread will be alive till the child thread is live"); 
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Main thread interrupted");
       }
       System.out.println("Main thread run is over" );
    }
}