package Ex_32_ao_33;
import java.util.Scanner;
public class Projeto_Produtos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produtos[] listaprodutos = new Produtos[10];
		
		
		for (int i=0; i<=9; i++) {
			Produtos p = new Produtos();
			
			System.out.printf("Digite o ID do produto: ");
			p.id = ler.nextInt();
				
			System.out.printf("Digite o Nome do produto: ");
			p.descrição = ler.next();
				
			System.out.printf("Digite a valor do produto: ");
			p.valor = ler.nextDouble();
			
			System.out.printf("Digite o quantidade do produto: ");
			p.quantidade = ler.nextDouble();
			
			listaprodutos[i] = p;
			
		}
		
		for (int i=0; i<=9; i++) {
			
			if(listaprodutos[i].valor <=100) {
				System.out.printf("\n %d - %s - %.2f\n", listaprodutos[i].id, listaprodutos[i].descrição, listaprodutos[i].valor);
			}
		}
		

	}

}
