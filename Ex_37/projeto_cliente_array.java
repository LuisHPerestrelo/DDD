package Ex_37;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Ex_35.contabancaria;

public class projeto_cliente_array {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<cliente> listacliente = new ArrayList<>();
		char possuicontabancaria;
		int opcao;
		int id;
		String nome;
		int idade;
		String email;
		contabancaria conta;
		String agencia;
		
		do {
			System.out.printf("===>Sistema de cadastro de clientes<===\n\n");
			
			System.out.printf(	"1 - Incluir Cliente \n" +
								"2 - Alteração de email\n" + 
								"3 - Excluir cliente\n" + 
								"4 - Exibir cliente\n" + 
								"5 - Sair\n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				cliente c = new cliente();
				
				id = listacliente.size() + 1;
				c.setId(id);
				
				System.out.printf("digite o nome do cliente");
				nome = ler.next();
				c.setNome(nome);
				
				System.out.printf("digite o idade do cliente");
				idade = ler.nextInt();
				c.setIdade(idade);
				
				System.out.printf("digite o email  do cliente");
				email = ler.next();
				c.setEmail(email);
				
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
				
					listacliente.add(c);
					
					
					System.out.printf("Cliente incluído com sucesso!");
	                System.in.read();
			
			}
			
			else if (opcao == 2) {
				 for(cliente a: listacliente) {
	                    System.out.printf("ID: %d - Nome: %s \n", a.getId(), a.getNome());
			}
				 System.out.printf("\nDigite o id do cliente que deseja atualizar: ");
				 id = ler.nextInt();
				 
				 System.out.printf("Digite o novo email do cliente: ");
	               email = ler.next();
	               
	               cliente c = listacliente.get(id-1);
	             
	               
	               c.setEmail(email);
	               
	               System.out.printf("Email atualizado com sucesso!");
			}
			
			else if (opcao == 3) {
				for(cliente a: listacliente) {
					System.out.printf("ID: %d - Nome: %s \n", a.getId(), a.getNome());
					}
				System.out.printf("\nDigite o id do cliente que deseja excluir: ");
				 id = ler.nextInt();
				
				 listacliente.remove(id-1);
				 
				 System.out.printf("Cliente excluido com sucesso!");
				 System.in.read();			
				 }
			else if (opcao == 4) {
				for(cliente a: listacliente) {
					System.out.printf("ID: %d - Nome: %s - Idade: %s - conta:%s", a.getId(), a.getNome(), a.getIdade(), a.exibirdadosconta());
				}
				
				System.in.read();
			}
		
		}while (opcao!=5);
		
		
	}}
		
		
		
	

