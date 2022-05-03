package Ex_37;

import Ex_37.contabancaria;

public class cliente {
	private int id;
	
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public contabancaria getConta() {
		return conta;
	}

	public void setConta(contabancaria conta) {
		this.conta = conta;
	}

	private String nome;
	private int idade;
	private String email;
	private contabancaria conta;

	
	cliente(){
		
	}
	
	cliente(int id, String nome, int idade, String email, contabancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirnomeidade() {
		return this.nome + " - " + this.idade;
	}
	
	public String exibirdadosconta() {
		if(this.conta != null)
			return "Ag:" + this.conta.getAgencia() + "\nnum:" + this.conta.getNumero();
		else
			return "não tem conta!";
	}
	
	
}
	
	

