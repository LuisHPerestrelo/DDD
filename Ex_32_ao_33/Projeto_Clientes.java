package Ex_32_ao_33;
import java.util.Scanner;

public class Projeto_Clientes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[10];
		
		for (int i=0; i<=4; i++) {
			
		Cliente c = new Cliente();
			
		System.out.printf("Digite o ID do cliente: ");
		c.id = ler.nextInt();
			
		System.out.printf("Digite o Nome do cliente: ");
		c.Nome = ler.next();
			
		System.out.printf("Digite a Idade do Cliente: ");
		c.idade = ler.nextInt();
		
		System.out.printf("Digite o email do cliente: ");
		c.email = ler.next();
		
		listaClientes[i] = c;
		
	
		
		}
		
		for (int i=0; i<=4; i++) {
			
			if (listaClientes[i].idade > 18)
				System.out.printf("\n pessoas maiores de 18anos. \n %d, %s, %d\n", listaClientes[i].id, listaClientes[i].Nome, listaClientes[i].idade);
		
		}
	}

}
