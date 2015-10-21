/*
	Eduardo Herrera Dominguez   - A00399780 
	Miguel Angel Cesar Soto     - A01322634
	Nahum Andres Espinosa Solis - A01322193
*/

import java.util.Random;

public class Primos implements Runnable
{
   
    private final String taskName; // name of task
    private final static Random generator = new Random();
    private final int numero;
    private final int sleepTime; // random sleep time for thread
    
    // constructor
    public Primos( String taskName , int numero)
    {
        this.taskName = taskName; // set task name
        this.numero = numero;
        sleepTime = generator.nextInt( 2000 ); // milliseconds
    } // end PrintPrimos constructor

    // method run contains the code that a thread will execute
    public void run(){
        try // put thread to sleep for sleepTime amount of time
        {
            
            for(int i = 2, contador = 0; ; i++)
            {
                
                int tempo = 0;
                for(int j=1; j<=i; j++)
                {   
                    if(i%j == 0)
                        tempo++;
                }
                
                if(tempo == 2)
                {
                    contador++;
                    System.out.printf( "Primo %d = %d \n",contador,i);
                    System.out.printf( "%s going to sleep for %d milliseconds.\n",taskName, sleepTime );
                    Thread.sleep( sleepTime ); // put thread to sleep
                }
                
                if(contador == numero)
                    break;
            }
            
        } // end try
        catch ( InterruptedException exception )
        {
            System.out.printf( "%s %s\n", taskName,"terminated prematurely due to interruption" );
        } // end catch
        // print task name
        System.out.printf( "%s done sleeping\n", taskName );
    } // end method run
} // end class PrintPrimos
