package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_29_do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int f1 = 1, f2 = 0, i = 0;
		
		System.out.printf("%d", f1);
		
		do {
			f1 = f1 + f2; 
			f2 = f1 - f2;
			i++;
			System.out.printf("\n%d", f1);
		}
		while (i<30);

	}

}
