package exercicio;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        
		System.out.print("Digite o Tempo Gasto na Viagem:");
		Double Temp = scn.nextDouble();
		
		System.out.print("Digite a Velocidade Media:");
		Double Vel = scn.nextDouble();
		
		Double Dist = Temp*Vel;
		
		System.out.println("A Distancia da Viagem É:" + Dist);
		
		Double Litr = Dist/12;
		
		System.out.println("O Combustível Gasto É:" + Litr);
	}

}
