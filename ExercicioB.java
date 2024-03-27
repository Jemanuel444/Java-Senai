package exercicio;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
        System.out.print("Quantos Votos teve o Candidato A: ");
        Double CandA = scn.nextDouble();
        
        System.out.print("Quantos Votos teve o Candidato B: ");
        Double CandB = scn.nextDouble();
        
        System.out.print("Quantos Votos teve o Candidato C: ");
        Double CandC = scn.nextDouble();
        
        System.out.print("Quantos Votos Nulos Houveram? : ");
        Double Nulo = scn.nextDouble();
        
        System.out.print("Quantos Votos em Branco Houveram? : ");
        Double Branco = scn.nextDouble();
        
        Double Total_Eleitores = CandA + CandB + CandC + Nulo + Branco;
        
        Double Validos = ((CandA + CandB + CandC)/Total_Eleitores)*100;
        
        Double EleitoresA = (CandA/Total_Eleitores)*100;
        Double EleitoresB = (CandB/Total_Eleitores)*100;
        Double EleitoresC = (CandC/Total_Eleitores)*100;
        Double Nulos = (Nulo/Total_Eleitores)*100;
        Double Brancos = (Branco/Total_Eleitores)*100;
        
        System.out.println("O Total de Eleitores É:" + Total_Eleitores);
        System.out.println("O Total de Votos Validos É:"+ Validos);
        System.out.println("A Porcentagem de Eleitores que Votaram no Candidato A É :" + EleitoresA);
        System.out.println("A Porcentagem de Eleitores que Votaram no Candidato B É :" + EleitoresB);
        System.out.println("A Porcentagem de Eleitores que Votaram no Candidato C É :" + EleitoresC);
        System.out.println("A Porcentagem de Eleitores que Votaram Nulo É :" + Nulos);
        System.out.println("A Porcentagem de Eleitores que Votaram em Branco É :" + Brancos);        
        
     
     
	}

}
