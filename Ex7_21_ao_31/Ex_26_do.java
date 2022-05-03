package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_26_do {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, A, B, result, i;
		
		
		do {
			System.out.printf("Digite um valor positivo:");
			num = ler.nextInt();
		} while (num<0);
		

		System.out.printf("Digite um intervalo inicial:");
		A = ler.nextInt();
		
		do {
			System.out.printf("Digite o fim do intervalo:");
			B = ler.nextInt();
		}while(B<=A);
		
		do {
			
			result = num * B;
			B--;
			
			System.out.printf("\n %d x %d = %d", num, B, result);
		} while (B>=A);
		} 
		

}
