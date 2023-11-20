import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {
		/*Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento, 
		 * que puede ser ascendente o descendente, a continuación, según el orden indicado se mostrarán en
		 * pantalla dichos números. Ej.: si los números introducidos son 4,7,2 y se escoge orden ascendente
		 * (de menor a mayor) aparecen en pantalla en este orden 2,4,7, si el ordenamiento es descendente 
		 * (de mayor a menor) se mostrarán en el siguiente 7, 4, 2. Utiliza estructuras de control adecuadas.*/
		
		int a=0 ;
		int b=0 ;
		int c=0 ;
		int orden = 5 ;
		
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Escriba un número"); 
		 
		a= sc.nextInt();
		
		System.out.println("Escriba otro número");

		b= sc.nextInt();
		
		System.out.println("Escriba un último número");
		
		c= sc.nextInt();
		
		System.out.println("Pulsa 9 si lo ordenamos de forma ascendente o 1 si lo ordenamos de forma descendente");
		
		orden= sc.nextInt() ;
		
		if (orden<5 ) { if (a>b & b>c) {System.out.println(a+","+b+","+c);
		} else if (a>b & b>c) {System.out.println(a+","+c+","+b);
			
		}  else if (b>a & a>c) { System.out.println(b+","+a+","+c);
			
		} else if (b>c & c>a) {System.out.println(b+","+c+","+a);
			
		} else if (c>a & a>b) {System.out.println(c+","+a+","+b);
			
		} else if (c>b & b>a ) { System.out.println(c+","+b+","+a);
		

		}
			
		} else { if (a<b & b<c) {System.out.println(a+","+b+","+c);
		
		
		} else if (a<b & b<c) {System.out.println(a+","+c+","+b);
			
		}  else if (b<a & a<c) { System.out.println(b+","+a+","+c);
			
		} else if (b<c & c<a) {System.out.println(b+","+c+","+a);
			
		} else if (c<a & a<b) {System.out.println(c+","+a+","+b);
			
		} else if (c<b & b<a ) { System.out.println(c+","+b+","+a);

		}
		
		}
		sc.close();
	}

}
