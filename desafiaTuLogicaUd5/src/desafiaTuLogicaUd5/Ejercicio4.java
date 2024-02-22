package desafiaTuLogicaUd5;

import java.io.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona Persona1=new Persona("Antonio","Díaz",27,1.80 );
		Persona Persona2=new Persona("Juan","Sanchez",31,1.75 );
		Persona Persona3=new Persona("Javier","Alarcón",26,1.82 );
		
		escribirObjeto(Persona1);
		escribirObjeto(Persona2);
		escribirObjeto(Persona3);
		leerObjeto(Persona1);
		leerObjeto(Persona2);
		leerObjeto(Persona3);
		
	}

	public static void escribirObjeto(Persona person ) {
		FileOutputStream fichero=null;
		
		try {
			
		 
		//Creamos el fichero
		fichero= new FileOutputStream("persona.dat", true);
		//Creamos el objeto con el que escribimos en el archivo
		ObjectOutputStream escribir = new ObjectOutputStream(fichero);
		escribir.writeObject(person);
		escribir.close();
		//Capturaremos la excepcion
		}catch (FileNotFoundException e) {
			e.printStackTrace(); //que imprima la pila de erores
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Error en la escritura");
			//Cerrar fichero haya o no excepción
		}finally {
			try {
				fichero.close();
		
			}catch (IOException e) {
				e.printStackTrace();}
		}
		
		
	
	}
	
	public static void leerObjeto(Persona person) {
		FileInputStream fichero=null;
			try {
			fichero = new FileInputStream("persona.dat");
			ObjectInputStream lectura = new ObjectInputStream(fichero);
			lectura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		System.out.println(person.toString());
		
		
	}
	
}
		
	

