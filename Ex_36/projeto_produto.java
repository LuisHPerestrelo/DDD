package Ex_36;
import java.util.Scanner;

import Ex_34.cliente;
public class projeto_produto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
	produto[] listaproduto = new produto[5];
		int id;
		String nome;
		double preco;
		double quantidade;
		Categoria Categoria;
	
	for(int i=0; i<5; i++) {
		produto p = new produto();
		
		System.out.printf("digite o id do produto");
		id = ler.nextInt();
		p.setId(id);
		
		System.out.printf("digite o nome do produto");
		nome = ler.next();
		p.setNome(nome);
		
		System.out.printf("digite o preço do produto");
		preco = ler.nextDouble();
		p.setPreco(preco);
		
		System.out.printf("digite a quantidade:");
		quantidade = ler.nextDouble();
		p.setQuantidade(quantidade);
		
		Categoria ct = new Categoria ();
		
		System.out.printf("digite o id da categoria:");
		ct.id = ler.nextInt();
		
		System.out.printf("digite o nome da categoria:");
		ct.nome = ler.next();
		
		Categoria = ct;
		
		
		listaproduto[i] = p;
	}
	
	for(int i=0; i<5; i++) {
		System.out.printf("\n%s", listaproduto[i].exibirnomepreco());
		System.out.printf("\n%s", listaproduto[i].exibirnomequantidade());
	
	}
	
	

}}
