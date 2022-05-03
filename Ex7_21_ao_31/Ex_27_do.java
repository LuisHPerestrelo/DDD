package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_27_do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int result, n=1, i=1;
		char t;
		
		
		do {
			do { 
			result = n * i;
			System.out.printf("\n%d x %d = %d", n, i , result);
			i++; 
			}while (i<=10);
			
			System.out.printf("\nDigite qualquer tecla");
			t = ler.next().charAt(0);
			i = 1;
			n++;
		} while (n<=20);
		
		
		
		

}}
