package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_27_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int result;
		char t;
		for (int n=1; n<=20; n++) {
			for(int i=1; i<=10; i++) {
				result = n * i;
				System.out.printf("\n%d x %d = %d", n, i, result);
				
				
				
		}
			System.out.printf("\ndigite qualquer tecla para continuar");
			t = ler.next().charAt(0);
			
		}
		System.out.printf("obrigado !");
		

	}

}
