package primeiroProjeto;

import java.util.Scanner;

public class Inteiron1n2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int cont;
		
		System.out.println("Informe um n�mero inteiro:");
		int n1 = teclado.nextInt();
		System.out.println("Informe um n�mero real:");
		float n2 = teclado.nextFloat();
		
		System.out.print("Ordena��o: ");
		
		for(cont = 0; cont <= n1; cont++) {
		
		System.out.printf("%d ", cont);
		
		}
		System.out.printf("\n\n");
		float media = (n1 + n2) / 2f;
		
		System.out.printf("Media de N1 e N2 = %.2f\n\n", media);
		
		if (n1 % 2 == 1) {
			int cont1;
			
			System.out.println("Informe um n�mero inteiro:");
			int n3 = teclado.nextInt();
			System.out.println("Informe outro n�mero inteiro:");
			float n4 = teclado.nextFloat();
			
			if (n3<n4) {
			System.out.println("N3 � menor que N4");
			}
			else if (n3>n4) {
			
			System.out.println("N3 � maior que N4");	
			}
			else {
				System.out.println("N3 e N4 s�o iguais");
			}
	}
}
}

	
