package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_23_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		
	char sexo;
	
		System.out.printf("informe seu sexo");
		sexo = ler.next().charAt(0);

			
		while (sexo != 'M' && sexo != 'F'){
				System.out.printf("sexo invalido, digite M ou F:");
				sexo = ler.next().charAt(0);
		}
		System.out.printf("Obrigado!");
			
	}
}
	
	
		
	
	
