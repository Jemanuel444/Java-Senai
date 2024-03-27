package exercicio;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		System.out.print("Digite o Valor do Produto:");
		Double Prod = scn.nextDouble();
		
		System.out.print("Digite O Valor da Taxa do Produto:");
		Double Taxa = scn.nextDouble();
		
		System.out.print("Digite O Tempo das Parcelas:");
		Double Temp = scn.nextDouble();
		
		Double Prest = Prod + (Prod*(Taxa/100)*Temp);
		 
		System.out.println("O Valor das Prestações é:" + Prest);
	}

}
