package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_26_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, A,B, r, i;
		
		System.out.printf("informe um numero");
		num = ler.nextInt();
		
		System.out.printf("informe o intervalo para iniciar a tabuada:");
		A = ler.nextInt();
		System.out.printf("informe até onde deseja a tabuada:");
		B = ler.nextInt();
		
		while (B < A) {
			System.out.printf("o valor do intervelo deve ser maior que o primeiro");
			B = ler.nextInt();
		}
		
		
		while (B >= A) {
			r = num * B;
			System.out.printf("\n %d X %d = %d", num, B, r);
			B--;
			
			
		}
					
	}

}
