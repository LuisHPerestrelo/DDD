package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_21_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i;
		
		System.out.printf("Digite um valor positivo:");
		num = ler.nextInt();
		
		while (num < 0) {
			System.out.printf("Por favor digite um numero positivo:");
			num = ler.nextInt();
			
			}
		System.out.printf("valor aceito!");
		
		

	}

}
