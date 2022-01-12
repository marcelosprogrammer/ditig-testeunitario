package br.com.marcelos.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.marcelos.dao.FuncionarioDAO;
import br.com.marcelos.model.Funcionario;

public class FuncionarioDaoImpl implements FuncionarioDAO {
	
	List<Funcionario> lista = new ArrayList<Funcionario>();
	
	
	@Override
	public void salvar(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub
		lista.add(funcionario);
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
		// TODO Auto-generated method stub
		return lista;
	}

}
