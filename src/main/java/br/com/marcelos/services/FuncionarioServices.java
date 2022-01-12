package br.com.marcelos.services;

import java.util.List;

import br.com.marcelos.dao.impl.FuncionarioDaoImpl;
import br.com.marcelos.interfaces.IFuncionarioServices;
import br.com.marcelos.model.Funcionario;

public class FuncionarioServices implements IFuncionarioServices{
	
	FuncionarioDaoImpl funcionarioImpl = new FuncionarioDaoImpl();

	@Override
	public void salvar(Funcionario funcionario) throws Exception {
		funcionarioImpl.salvar(funcionario);
	}

	@Override
	public void atualizar(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario carregar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario buscarPorNome(String nome) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> listar() throws Exception {
		return funcionarioImpl.listar();
	}
	

}
