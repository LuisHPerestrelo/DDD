package Ex_34;
import java.util.Scanner;
public class projeto_cliente_conta {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		cliente[] listacliente = new cliente[2];
		char possuicontabancaria;
		int id;
		String nome;
		int idade;
		String email;
		contabancaria conta;
		
		
		char atualizaemail;
		
		for(int i=0; i<2; i++) {
			
			System.out.printf("digite o id do cliente");
			id = ler.nextInt();
			
			System.out.printf("digite o nome do cliente");
			nome = ler.next();
		
			System.out.printf("digite o idade do cliente");
			idade = ler.nextInt();
			
			System.out.printf("digite o email  do cliente");
			email = ler.next();
		
			System.out.printf("Possue conta bancaria ?");
			possuicontabancaria = ler.next().charAt(0);
			
			if (possuicontabancaria == 'S') {
				contabancaria ct = new contabancaria();
				
				System.out.printf("digite a agencia  do Conta");
				ct.agencia = ler.next();
			
				System.out.printf("digite o numero do conta");
				ct.numero = ler.next();
			
				System.out.printf("digite o saldo do conta");
				ct.saldo = ler.nextDouble();	
			
				conta = ct;
			}
			else {
				conta = null;
			}
			
			cliente c = new cliente(id, nome, idade, email, conta);
			
			listacliente[i] = c;
			
		}
		for(int i=0; i<2; i++) {
			System.out.printf("\n%s", listacliente[i].exibirnomeidade());
			System.out.printf("\n%s", listacliente[i].exibirdadosconta());
			System.out.printf("\nDeseja atualizar o email ?");
			atualizaemail = ler.next().charAt(0);
			
			if (atualizaemail == 'S') {
				System.out.printf("digite o email  do cliente");
				email = ler.next();
				
				listacliente[i].atualizarEmail(email);
				
				System.out.printf("Email atualizado com sucesso! \n novo email: %s", listacliente[i].email);
			}
			
			
			
			
		}
	}
		
	}


