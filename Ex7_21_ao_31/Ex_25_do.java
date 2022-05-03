package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_25_do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, result, i = 1;
		
		
		do {
			System.out.printf("digite um valor positivo:");
			num = ler.nextInt();
		} while (num<0);
		
		do {
			result = num * i;
			System.out.printf("\n%d x %d = %d", num, i, result);
			i++;
			}while (i<=10);
		
	}}


