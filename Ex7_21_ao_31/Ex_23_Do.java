package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_23_Do {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char sexo;
		
		do {
			System.out.printf("Digite um sexo (M/F): ");
			sexo=ler.next().charAt(0);
		} 
		while (sexo != 'M' && sexo != 'F');

		System.out.printf("Obrigado!"); 
	}

}
