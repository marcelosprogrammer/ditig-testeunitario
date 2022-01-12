package br.com.marcelos.testes;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import br.com.marcelos.enums.Sexo;
import br.com.marcelos.model.Funcionario;
import br.com.marcelos.services.FuncionarioServices;

public class FuncionarioTest {

	
	@Test
	public void testarSalvarSalarioComValorNegativo() {
		FuncionarioServices funcionarioServices = new FuncionarioServices();
		Funcionario funcionario= new Funcionario();
		funcionario.setId(1);
		funcionario.setFuncao("Desenvolvedor");
		funcionario.setNome("Joana Dark");
		funcionario.setSalario(-20000.00);
		funcionario.setSexo(Sexo.FEMININO);
		funcionario.setTelefone("047 87853-9879");	
		Assert.assertTrue("O valor do Salario é menor ou igual a ZERO ",funcionario.getSalario().doubleValue() > 0);
	}
}
