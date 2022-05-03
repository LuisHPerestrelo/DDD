package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_28_while {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int soma, i;
		
		soma=0;
		i = 1;
		
		while (i <= 100){
			
			i++;
			soma = soma + i;	
		}
		
		System.out.printf("a soma dos numeros são: %d", soma);
		
	}

}
