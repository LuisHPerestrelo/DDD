package Ex_34;

public class cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public contabancaria conta;

	
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
			return "Ag:" + this.conta.agencia + "\nnum:" + this.conta.numero;
		else
			return "não tem conta!";
	}
	
	
}
	
	
