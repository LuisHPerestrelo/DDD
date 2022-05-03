package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_21_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.printf("Digite um valor positivo:");
			num=ler.nextInt();
		}
		while (num < 0);
		
		System.out.printf("Valor aceito, Obrigado!");
		

	}

}
