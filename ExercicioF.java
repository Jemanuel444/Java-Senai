package exercicio;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
        System.out.print("Informe o Raio da Esfera : ");
        Double Raio = scn.nextDouble();
        
        Double Vol = (4/3)*3.14159*(Math.pow(Raio,3));
        
        System.out.println("O Volume da Esfera é:" + Vol);
        
         
    
      
     
	}

}
