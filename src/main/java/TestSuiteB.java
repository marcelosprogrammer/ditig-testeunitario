import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.marcelos.testes.FuncionarioTest;

public class TestSuiteB {


	@RunWith(Suite.class)
	@Suite.SuiteClasses({ FuncionarioTest.class })

	public class TestSuite {

	}

}
