package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_25_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, i, m;
		
		i = 1;
		System.out.printf("qual o numero que deseja a tabuada ?\n");
		num1 = ler.nextInt();
		
		while (num1 < 0) {
			System.out.printf("o numero precisa ser positivo:");
			num1 = ler.nextInt();
			
		}
		
		while (i<=10) {
			m = num1 * i;
			System.out.printf("\n %d x %d = %d", num1, i, m);
			i++;
		}
	}

}
