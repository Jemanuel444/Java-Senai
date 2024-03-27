package exercicio;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
        System.out.print("Informe o Valor da Base : ");
        Double Base = scn.nextDouble();
  
        System.out.print("Informe o Valor do Expoente : ");
        Double Expo = scn.nextDouble();
       
       Double Potencia = Math.pow(Base,Expo);
       
       System.out.println(" O Valor da Base é:" + Base);
       System.out.println(" O Valor do Expoente é:" + Expo);
       System.out.println("Logo o Valor da Potencia Será:" + Potencia);
        
         
    
      
     
	}

}
