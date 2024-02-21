package desafiaTuLogicaUd5;


import java.io.*;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta=System.getProperty("user.dir");
		String fichero=ruta+File.separator+"tres.dat"; 
		
		System.out.println(fichero);
		crearArchivo();
		escBinario(fichero);

	}

	public static void crearArchivo() {
		File archivo = new File ("tres.dat");
		try {
			if (archivo.createNewFile()) System.out.println("Archivo creado");
			else System.out.println("El archivo ya existe");
		} catch (IOException e) { e.printStackTrace();}
		
	
	}
	public static void escBinario(String fichero) {

		Scanner sc = new Scanner(System.in) ;
		int num;
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(fichero));
			System.out.println("Introduce números positivos.Para finalizar introdece el número -1");
			
			while (true) {
				System.out.println("Número: ");
				num = sc.nextInt();

				if (num<0) {
					
					System.out.println("Finalizó la introducción de datos");
					break;
				}
				
				out.writeInt(num);
				sc.close();
				out.close();
			}
		} catch (Exception e) {
			System.err.println("Error al escribir en el archivo");
			e.printStackTrace();
		}
	}
	

}
