import java.io.*;
	import java.util.*;
	/**
	* @author Carlos Raxtum 19721
	* älgoritmos y estructura de datos
	*/ 
public class Generador {
	//me generara el archivo txt
		Random r = new Random();
		int n = 0;
		String nameFile = "random_numbers.txt";

		public ArrayList<String> dataArray = new ArrayList<String>();
		
		public ArrayList<String> randomNumberGenerator(int cantidad) {

			try (PrintWriter file = new PrintWriter(
				new BufferedWriter(
					new FileWriter(nameFile)));
			){
				for(int i = 0; i<cantidad; i++){
					n = r.nextInt(cantidad);
					//file.println(n);
					dataArray.add(String.valueOf(n));
					file.println(n);
				}
				//file.println(dataArray);
			}catch(IOException e){
				e.printStackTrace();
			}

			System.out.println("File " + nameFile + " has been created!");

			return dataArray;
		}

		public ArrayList<String> getArray(){
			return dataArray;
		}
		//Me llenara el array de numeros random
		public static int [] llenarArrayAleatorio(int desde, int hasta, int tam){
			int[] numeros = new int[tam];
	        Random rnd = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
	        }
	        return numeros;
		}
}
