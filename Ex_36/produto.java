package Ex_36;

public class produto {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private double preco;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	private double quantidade;

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	private Categoria Categoria;

	public Categoria getCategoria() {
		return Categoria;
	}

	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	

		produto(){
			
		}
		produto (int id, String nome, double preco, double quantidade, Categoria Categoria){
			this.id = id;
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
			this.Categoria = Categoria;
		}
		


	public String exibirnomepreco() {
		return this.nome + " - valor:" + this.preco;
		
	}
	
	public String exibirnomequantidade() {
		return this.nome + " - quantidade:" + this.quantidade;
	}
}
