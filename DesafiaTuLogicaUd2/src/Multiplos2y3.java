public class Multiplos2y3 {

	public static void main(String[] args) {
		/*Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100. 
		 *Utiliza las estructuras de control que creas convenientes.*/
			
		int num1 ;
		int num2 ;
		int resultado=0 ;
		
		for (num1=2; num1<=100 ; num1=num1+2 ) {
			resultado=resultado+1 ;
			System.out.println(num1);
		}
		for (num2=3 ; num2<=100 ; num2=num2+3 ) {
			resultado=resultado+1 ;
			System.out.println(num2);
		} ;	
		
		System.out.println("En total hay " +resultado+ " multiplos de 2 y de 3 menores que 100");
		
	}

}
