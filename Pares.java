
/*
	Eduardo Herrera Dominguez   - A00399780 
	Miguel Angel Cesar Soto     - A01322634
	Nahum Andres Espinosa Solis - A01322193
*/

import java.util.Random;

public class Pares implements Runnable 
{
   
    private final int numeros;
    private final String taskName;
    private final static Random generator = new Random();
    private final int sleepTime;
    
    public Pares(String taskName,int numeros)
    {
            this.numeros = numeros;
            this.taskName = taskName;
            sleepTime = generator.nextInt(2000);
    }
    
    public void run()
    {
        try
        {
            int contador = 0, par=0;
            while( contador < numeros)
            {
                par+=2;
                contador++;
                System.out.printf( "Par %d = %d \n",contador,par);
                System.out.printf( "%s going to sleep for %d milliseconds.\n",taskName, sleepTime );
                Thread.sleep( sleepTime );
            }
        
            
        }
        catch ( InterruptedException exception )
        {
            System.out.printf( "%s %s\n", taskName,"terminated prematurely due to interruption" );
        } // end catch
           System.out.printf( "%s done sleeping\n", taskName );
    }
    
}
