package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_27_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 1, i = 1, result;
		char t;
		
		while(n <=20) {
			while (i<=10) {
				
				result = n * i;
				System.out.printf("\n%d x %d = %d", n, i, result);
				i++;
			}
			System.out.printf("\nDigite qualquer tecla");
			t = ler.next().charAt(0);
			i = 1;
			n++;
			
			}
		System.out.printf("Obrigado !");
		}}
		 
		
		
		
			
			
			
			
			
			
			
		
		
		
		
		
		
	


