package primeiroProjeto;

import java.util.Scanner;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a altura entre 2 andares da constru��o (m):");
		float alturaConstru��o = teclado.nextFloat();
		
		System.out.println("Informe a quantidade de degraus que deseja construir (cm):");
		float quantidadeDegraus = teclado.nextFloat();
		
		float degrauAlturaemCentimetro = (alturaConstru��o / quantidadeDegraus) * 100;
		
		System.out.println("Altura de cada um dos degraus que dever�o ser constru�dos:" + degrauAlturaemCentimetro + "cm.");
				
	}
	
	
	
	
}
