package br.com.marcelos.dao;

import java.util.List;

import br.com.marcelos.model.Funcionario;

public interface FuncionarioDAO {
	
	public void salvar (Funcionario funcionario) throws Exception;
	public void atualizar (Funcionario funcionario) throws Exception;
	public void excluir (Funcionario funcionario) throws Exception;
	public Funcionario carregar (Integer id) throws Exception;
	public Funcionario buscarPorNome(String nome) throws Exception;
	public List<Funcionario> listar() throws Exception;
	
	
	

}
