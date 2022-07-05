// Use sleep and join methods with thread.
import java.lang.*;

public class Main 
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t= new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("First Task");
                System.out.println("Sleeping for 3 seconds");
                try
                {
                    Thread.sleep(3000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("First Task is done");
            }
        });
        Thread t1= new Thread(new Runnable()
        {
            public void run()
            {
                System.out.println("Second Task is done");
            }
        });
        t.start();
        t.join();
        t1.start();
    }
}
