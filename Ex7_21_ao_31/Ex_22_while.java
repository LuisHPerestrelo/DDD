package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_22_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		
		System.out.printf("informe o primeiro valor:");
		num1 = ler.nextInt();
		System.out.printf("informe um valor maior que o primeiro:");
		num2 = ler.nextInt();
		
		while (num2 <= num1) {
			System.out.printf("o valor é menor, digite um valor maior que o primeiro:");
			num2 = ler.nextInt();
		}
		System.out.printf("valor aceito!");
	}

}