package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_24_do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i=1, result = 0; 
		do {
			result = 5 * i; 
			System.out.printf("\n 5 x %d = %d", i, result);
			i++;
			
		}
		while (i<11);

	}

}
