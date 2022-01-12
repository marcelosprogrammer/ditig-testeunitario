import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import br.com.marcelos.testes.FuncionarioTest;
import junit.framework.*;
public class TestSuite {

	public static void main(String[] a) {
		
		Result result = JUnitCore.runClasses(FuncionarioTest.class);
		System.out.println("Total de Testes " + result.getRunCount());
		System.out.println("Total de testes falhos " + result.getFailureCount());
		
		for(Failure failure : result.getFailures())
		{			
			System.out.println(failure.getMessage());
		}		
		System.out.println("O TESTE RETORNOU: "+result.wasSuccessful());
	   }
	
}
