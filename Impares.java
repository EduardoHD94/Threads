
/*
	Eduardo Herrera Dominguez   - A00399780 
	Miguel Angel Cesar Soto     - A01322634
	Nahum Andres Espinosa Solis - A01322193
*/

import java.util.Random;

public class Impares implements Runnable
{

    private final int sleepTime;
    private final int numeros;
    private final String taskName;
    private final static Random generator = new Random();
    
    public Impares(String taskName,int numeros)
    {
        this.numeros = numeros;
        this.taskName = taskName;
        sleepTime = generator.nextInt(2000);
    
    }
    
    public void run() 
    {
        try
        {
            int contador = 0, impar=1;
            while(contador < numeros)
            {
                contador++;
                System.out.printf("Impar %d = %d \n",contador,impar);
                impar+=2;
                Thread.sleep(sleepTime);
                
            }
        }
        catch(InterruptedException exception)
        {
            System.out.printf( "%s %s\n", taskName,"terminated prematurely due to interruption" );
        }
        
        System.out.printf( "%s done sleeping\n", taskName );
    }   
}
