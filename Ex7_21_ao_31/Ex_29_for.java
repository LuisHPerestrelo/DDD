package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_29_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int f1 = 1, f2 = 0;
		System.out.printf("%d", f1);
		for (int i = 0; i < 30; i++) {
			f1 = f1 + f2;
			f2 = f1 - f2;
			
			System.out.printf("\n%d", f1);
			
		}

	}

}
