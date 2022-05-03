package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_28_do {
	
		public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
	
			int soma=0, i=0;
			
			do {
				soma = soma + i;
				i++;
			} while (i<=100);
			
			System.out.printf("a Soma dos numeros é: %d", soma);
}}
