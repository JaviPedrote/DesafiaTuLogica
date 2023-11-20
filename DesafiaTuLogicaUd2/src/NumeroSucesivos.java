import java.util.Scanner;

public class NumeroSucesivos {

	public static void main(String[] args) {
		/*Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo. 
			A continuación, muestra los primeros 20 números sucesivos a dicho número.*/
		
		int numero=0 ;
		
		int resultado=1 ;
		
		boolean negativo ;
		
		try (Scanner sc = new Scanner(System.in)) {
			negativo = true ;
			
			while (negativo) {
				System.out.println("Escriba un numero positivo");
				numero = sc.nextInt();
				if (numero>0)
					negativo = false ;
			}
		}
		
		while (resultado < 21) { System.out.println( numero+resultado);
		resultado ++ ;				
		}	
	}

}
