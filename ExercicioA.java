package exercicio;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
        System.out.print("Digite o valor de A: ");
        int A = scn.nextInt();
       
        System.out.print("Digite o valor de B: ");
        int B = scn.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("Valores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);

    
	}

}
