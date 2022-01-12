package br.com.marcelos.model;

public class Funcionario {
	
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private Enum sexo;
	private String funcao;
	private Double salario;
	
	public Funcionario() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Enum getSexo() {
		return sexo;
	}

	public void setSexo(Enum sexo) {
		this.sexo = sexo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", sexo=" + sexo
				+ ", funcao=" + funcao + ", salario=" + salario + "]";
	}
	
	

}
