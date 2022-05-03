package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_23_For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		for (char sexo = 0; sexo != 'M' && sexo != 'F';) {
			System.out.printf("informe um sexo valido (M/F):");
			sexo = ler.next().charAt(0);
		}
			
		System.out.printf("Obrigado!");
	}

}
