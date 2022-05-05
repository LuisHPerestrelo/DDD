package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_30_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int f1 = 1, f2 = 1, f3 = 1;
		
			System.out.printf("%d, %d, %d", f1, f2, f3);
		
		for(int i=0; i<17; i++) {
			
			f1 = f1 + f2 + f3;
			f2 = f1 - f2 - f3;
			f3 = f1 - f2 - f3;
			
			System.out.printf(",%d", f1);
			
		}

	}

}
