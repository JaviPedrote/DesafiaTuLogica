package desafiaTuLogicaUd5;

import java.io.*;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		String ext = ".txt" ;
		
		Scanner entrada=new Scanner(System.in);

		System.out.println("Hola,crearé 2 archivos de texto con los nombre que usted me diga.Su nombre debe tener al menos 3 caracteres y extensión .txt");
		
		System.out.println("Digame el nombre del primer archivo");
		
		String Archivo1=entrada.nextLine() ;
		
		while (Archivo1.length()<3) {
			System.out.println("Nombre demasiado corto, vuelva a escribir el nombre del archivo con al menos 3 caracteres");
			Archivo1=entrada.nextLine();
			}
		
		Archivo1+=ext;
		
		System.out.println("El nombre del fichero "+ Archivo1+ " es válido");
		
		System.out.println("Dígame el nombre del segundo archivo");
		
		String Archivo2=entrada.nextLine() ;

		while (Archivo2.length()<3) {
			System.out.println("Nombre demasiado corto, vuelva a escribir el nombre del segundo archivo con al menos 3 caracteres");
			Archivo2=entrada.nextLine();
			}
		Archivo2+=ext;
		
		System.out.println("El nombre del fichero "+ Archivo2+ " es válido");
		
		String directorioActual = System.getProperty("user.dir");
		
		System.out.println(directorioActual);
		
		
		String rutaCompletaFich = directorioActual + File.separator + Archivo1;
		
		
		
	File archivo1 = new File(Archivo1);
	try {
		if (archivo1.createNewFile()) System.out.println("Archivo creado");
		else System.out.println("El archivo ya existe");
	} catch (IOException e) { e.printStackTrace();
	

	
	}	
	File archivo2 = new File(Archivo2);
	try {
		if (archivo2.createNewFile()) System.out.println("Archivo creado");
		else System.out.println("El archivo ya existe");
	} catch (IOException e) { e.printStackTrace();}
	
	
	
	if (comprobarExiste(archivo1)==true) { escribirEnFichero(archivo1);
		}

	if (comprobarExiste(archivo1)==true) { leerDeFichero(archivo1);
		}
	
	File ruta = new File(archivo1.getAbsolutePath());
	
	if (comprobarExiste(archivo1)==true) { 
		System.out.println("Nombre del archivo "+archivo1.getName());
		System.out.println("Ruta absoluta "+ ruta);
		System.out.println("Ruta del directorio padre "+ruta.getParent());
		System.out.println("Tamaño de archivo "+archivo1.length()+" bytes");
		if(archivo1.isDirectory()) {System.out.println("Es directorio");}
		else if(archivo1.isFile()) {System.out.println("Es un archivo");}
		if (archivo1.canRead()) {System.out.println("Permiso de lectura");}
		if (archivo1.canWrite()) {System.out.println("Permiso de escritura");}
		if (archivo1.canExecute()) {System.out.println("Permiso de ejecución");}
		if (archivo1.isHidden()) {System.out.println("El archivo está oculto");}
		else {System.out.println("El archivo no está oculto");}
		;
	}else {System.out.println("El archivo no existe");}
	
	duplicarFichero(archivo1,archivo2);
	
	borrarFichero(archivo1);
	
	leerDeFichero(archivo2);
	
	crearDirectorio("Ejer1");
	
	
	entrada.close();
	
	

	
	}
	
	public static void leerDeFichero(File miFichero) {
		try {FileReader leerArchivo=new FileReader(miFichero);
		int c ;
		System.out.println("El contenido del archivo "+miFichero+" es: ");
		while((c=leerArchivo.read())!=-1) {
			System.out.print((char)c);
		};
		leerArchivo.close();
			
		} catch (Exception e) { System.out.println("imposible leer archivo");
			e.printStackTrace();	}
	};
		
	public static void escribirEnFichero(File miFichero) {
		try (FileWriter escribir = new FileWriter(miFichero)) {
			for (int i = 0; i<11; i++) {
				escribir.write(String.valueOf(i));
				escribir.write("\n");
				}
			
		} catch (Exception e) { System.out.println("Error al escribir en el archivo");e.printStackTrace();
			// TODO: handle exception
		}
		
		
	};
	
	public static void borrarFichero(File miFichero) {
			miFichero.delete();
			System.out.println("Archivo "+miFichero+" eliminado");}

	public static boolean comprobarExiste(File a) {
		if (a.exists()) {System.out.println("true");}
		return true ; 		
		
	};
		
	public static void duplicarFichero(File origen,File destino) {
		try {FileReader leerArchivo=new FileReader(origen);
		while((leerArchivo.read())!=-1) {
			escribirEnFichero(destino);
				
		};
		leerArchivo.close();
			
		} catch (Exception e) { System.out.println("imposible leer archivo");
			e.printStackTrace();	}
	};
	
	public static void crearDirectorio(String dir){
		File directorio = new File (dir);
		comprobarExiste(directorio);
		if (directorio.mkdir())System.out.println("Directorio creado");
		else System.out.println("El directorio no se pudo cear");
	}	
	
}
