package Ex_38;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Ex_37.cliente;
public class projeto_produto {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<produto> listaproduto = new ArrayList<>();
		ArrayList<categoria> listacategoria = new ArrayList<>();
		char possuicategoria;
		int opcao;
		int id;
		String nome;
		double preco;
		double quantidade;
		categoria categoria;
		
		do {
			System.out.printf("===>Sistema de cadastro de produtos<===\n\n");
			
			System.out.printf(	"1 - Incluir produto \n" +
								"2 - Alteração do produto\n" + 
								"3 - Excluir produto\n" + 
								"4 - Exibir produto\n" + 
								"5 - Sair\n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				produto p = new produto();
				
				id = listaproduto.size() + 1;
				p.setId(id);
				
				System.out.printf("digite o nome do produto");
				nome = ler.next();
				p.setNome(nome);
				
				System.out.printf("digite o preço do produto");
				preco = ler.nextDouble();
				p.setPreco(preco);
				
				System.out.printf("digite a quantidade");
				quantidade = ler.nextDouble();
				p.setQuantidade(quantidade);
				
				System.out.printf("Possue categoria ?");
				possuicategoria = ler.next().charAt(0);
				
			if (possuicategoria == 'S') {
				categoria c = new categoria();
				id = listacategoria.size() + 1;
				c.setId(id);
				
				System.out.printf("digite o nome da categoria");
				nome = ler.next();
				c.setNome(nome);
				
				listacategoria.add(c);
				
			} else {
				categoria = null;
			}
			
			listaproduto.add(p);
			
			System.out.printf("produto incluído com sucesso!");
            System.in.read();
				
		}
			else if (opcao == 2) {
				 for(produto a: listaproduto) {
	                    System.out.printf("ID: %d - Nome: %s \n", a.getId(), a.getNome());
				 }
				 System.out.printf("\nDigite o id do produto que deseja atualizar: ");
				 id = ler.nextInt();
				 
				 System.out.printf("Digite o novo nome do produto: ");
	               nome = ler.next();
	               System.out.printf("Digite o novo preço do produto: ");
	               preco = ler.nextDouble();
	               System.out.printf("Digite a nova quantidade do produto: ");
	               quantidade = ler.nextDouble();
	               
	              
	               produto p = listaproduto.get(id-1);
	               p.setNome(nome);
	               p.setPreco(preco);
	               p.setQuantidade(quantidade);
	               
	               System.out.printf("Produto atualizado com sucesso!");
			
			}
			
			else if (opcao == 3) {
				for(produto a: listaproduto) {
					System.out.printf("ID: %d - Nome: %s \n", a.getId(), a.getNome());
					}
				System.out.printf("\nDigite o id do produto que deseja excluir: ");
				 id = ler.nextInt();
				
				 listaproduto.remove(id-1);
				 
				 System.out.printf("Produto excluido com sucesso!");
				 System.in.read();			
				 }
	         
			else if (opcao == 4) {
				for(produto a: listaproduto ) {
					System.out.printf("\nID: %d - Nome: %s - Preco: %s", a.getId(), a.getNome(), a.getPreco());
					
					System.out.printf("ID: %d - Nome: %s - Quantidade: %s", a.getId(), a.getNome(), a.getQuantidade());
					
					for(categoria b:listacategoria) {
						System.out.printf("\nID: %d - categoria: %s", b.getId(), b.getNome());
					}
					
					
				}
				
				System.in.read();
			}
		
	} while (opcao!=5);

	}
}

