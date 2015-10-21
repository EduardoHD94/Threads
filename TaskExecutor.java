
/*
	Eduardo Herrera Dominguez   - A00399780 
	Miguel Angel Cesar Soto     - A01322634
	Nahum Andres Espinosa Solis - A01322193
*/

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor
{
	public static void main(String[] args)
	{
       
        
		Primos primitos = new Primos("primos",5);
		Pares parcitos = new Pares("pares",5);
		Impares imparcitos = new Impares("impares",5);
		System.out.println("\n Starting Executor\n");
	     
		ExecutorService threadExecutor = Executors.newCachedThreadPool();

		threadExecutor.execute(parcitos);
		threadExecutor.execute(imparcitos);
		threadExecutor.execute(primitos);
		
		threadExecutor.shutdown();
		
		System.out.println("Tasks started, main ends.\n");

       	}    //endmain
}
