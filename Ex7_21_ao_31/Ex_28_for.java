package Ex7_21_ao_31;

import java.util.Scanner;

public class Ex_28_for {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i=0; i<=100; i++) {
			soma = soma + i;
			System.out.printf("\n%d", soma);
		}		
		
	}

}
