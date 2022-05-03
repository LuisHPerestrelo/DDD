package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_26_For {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
	int num, A, B, result;
	
		System.out.printf("Digite um valor:");
		num = ler.nextInt();
	
		for(num = num; num<0;) {
			System.out.printf("digite um valor positivo:");
			num = ler.nextInt();
		}
		
		System.out.printf("Digite o intervalo inicial");
		A = ler.nextInt();
		System.out.printf("Digite o fim do intervalor");
		B= ler.nextInt();
			for(B = B; B<A;) {
				System.out.printf("Digite um valor maior que intervalo inicial:");
				B= ler.nextInt();
			}
			
		for(B=B; B>=A; B--) { 
		result = num * B;
		
		System.out.printf("\n%d x %d = %d", A, B, result);		
		}			
					
			
		
		

	}

}
