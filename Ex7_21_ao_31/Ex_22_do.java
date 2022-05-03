package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_22_do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("Digite o primeiro valor:");
		num1 = ler.nextInt();
		
		do {
			System.out.printf("informe um valor maior que o primeiro:");
			num2 = ler.nextInt(); 
			
		}
		while (num2<num1);
		
		System.out.printf("Valor Aceito, Obrigado!");

	}

}
