package exercicio;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		System.out.print("Digite o Valor do Raio da Lata:");
		Double Alt = scn.nextDouble();
		
		System.out.print("Digite o Valor do Raio da Altura:");
		Double Rai = scn.nextDouble();
		
		Double Vol = 3.14159*Rai*Rai*Alt; 
		
		System.out.println("O Volume da Lata É:" + Vol);
	}

}
