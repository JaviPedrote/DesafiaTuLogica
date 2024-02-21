package desafiaTuLogicaUd5;

import java.io.*;



public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		
			
		String directorio = "dirEjer2";
		
		String ruta=System.getProperty("user.dir");
		
		String rutaDirectorio= ruta+ File.separator + directorio;
		
		String ruta1 = rutaDirectorio+File.separator+"uno.txt";
		
		String ruta2= rutaDirectorio+File.separator+"dos.txt";
		
		System.out.println(rutaDirectorio);
		
		System.out.println(ruta);
		
		
		crearDirectorio(directorio);
		
	
		crearArchivo(rutaDirectorio);
		
		bufferedWriter(ruta1);
		
		copiarArchivo(ruta1, ruta2);
		
		bufferedReader(ruta2);	

	}
	 
	public static void crearDirectorio(String dir){
		File directorio = new File (dir);
		if (directorio.mkdir())System.out.println("Directorio creado");
		else System.out.println("El directorio no se pudo cear");
		
	}
	
	public static void crearArchivo(String ruta) {
		File archivo = new File (ruta+File.separator+"uno.txt");
		try {
			if (archivo.createNewFile()) System.out.println("Archivo creado");
			else System.out.println("El archivo ya existe");
		} catch (IOException e) { e.printStackTrace();}
		File archivo2 = new File (ruta+File.separator+"dos.txt");
		try {
			if (archivo2.createNewFile()) System.out.println("Archivo creado");
			else System.out.println("El archivo ya existe");
		} catch (IOException e) { e.printStackTrace();}
	
	}
			
	public static void bufferedWriter(String fichero1) {
		
	        try {
	            // Abrimos el fichero "uno.txt" para escritura
	            BufferedWriter writer = new BufferedWriter(new FileWriter(fichero1));

	            // Pedimos al usuario que introduzca nombres
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            String nombre = "";

	   
	            
	            do {
	    	    	System.out.println("Introduzca nombres.Cuando quiera finalizar introduzca '-'");
	    	    	 writer.write(nombre); // Escribimos los nombre que se intruducen
	                 writer.newLine(); // Agregar una nueva línea
	    		} while (!(nombre = reader.readLine()).equals("-"));
	            
	            
	            writer.close();

	            } catch (IOException e) {
	            e.printStackTrace();}
	    		}

	public static void copiarArchivo(String ficheroOrigen, String ficheroDestino) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;

		
		try {
			/*se crean los flujos de entrada y salida,
			para ello se instancian los objetos de las clases*/
			in = new FileInputStream(ficheroOrigen);
			out = new FileOutputStream(ficheroDestino);
			int c; 
			//cada byte se guarda en una variable de tipo int
			//Se repite el bucle mientras no sea fin de fichero 
			while((c=in.read())!=-1) {
			out.write(c);
			}
			}catch(IOException ex) {
			System.out.println("El fichero de lectura origen no existe, debes crearlo antes ");
			}finally {
			if(in!=null)
			in.close();
			if(out!=null)
			out.close();
			}
	}

	public static void bufferedReader(String fichero) {
		try { 
		

         
         BufferedReader leer = new BufferedReader(new FileReader(fichero));
         String linea;

         System.out.println("Contenido del fichero:");
         while ((linea = leer.readLine()) != null) {
             System.out.println(linea); 
         }

         leer.close();
     } catch (IOException e) {
         e.printStackTrace();

     }
	
	}
}
