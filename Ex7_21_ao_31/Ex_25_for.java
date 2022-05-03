package Ex7_21_ao_31;
import java.util.Scanner;
public class Ex_25_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, result;
		
			System.out.printf("digite um valor para tabuada:");
			num = ler.nextInt();
		
		for (int i=1; i<=10; i++){
			
				for (num = num;num<0;) {
					System.out.printf("não existe tabuada negativa.\n Por favor digite um valor positivo:");
					num = ler.nextInt();
					}
			
			result = num * i;
			System.out.printf("\n%d x %d = %d", num, i, result);
			
			
			
		
		

	}}

}
