package Ex_38;

public class produto {
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	private String nome;
	private double preco;
	private double quantidade;
	categoria categoria;
	
	
	produto(){
		
	}
	
	produto(int id, String nome, double preco, double quantidade, categoria categoria){}
	
	public Object Categoria() {
		
		return this.id + "-" + this.nome;
	}

	

}
