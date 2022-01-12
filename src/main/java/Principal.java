import br.com.marcelos.model.Funcionario;
import br.com.marcelos.services.FuncionarioServices;
import br.com.marcelos.enums.Sexo;

public class Principal {

	public static void main(String[] args) throws Exception {

		FuncionarioServices funcionarioServices = new FuncionarioServices();
		
		//Preenchimento do Objeto Funcionario	
		Funcionario funcionario= new Funcionario();
		funcionario.setId(1);
		funcionario.setFuncao("Desenvolvedor");
		funcionario.setNome("Joana Dark");
		funcionario.setSalario(20000.00);
		funcionario.setSexo(Sexo.FEMININO);
		funcionario.setTelefone("047 87853-9879");
		
		funcionarioServices.salvar(funcionario);
		
		Funcionario funcionarioB= new Funcionario();
		funcionarioB.setId(2);
		funcionarioB.setFuncao("Analista de Sistemas");
		funcionarioB.setNome("Godan Five");
		funcionarioB.setSalario(40000.00);
		funcionarioB.setSexo(Sexo.MASCULINO);
		funcionarioB.setTelefone("048 98769-0985");
		
		funcionarioServices.salvar(funcionarioB);
		
		for (Funcionario unidadeFuncionario : funcionarioServices.listar()) {
			System.out.println(unidadeFuncionario.toString());
		}
	}
}
