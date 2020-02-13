import java.util.ArrayList;

public class Main {

	/**
	 * @author Carlos Raxtum 19721
	 * älgoritmos y estructura de datos
	 */ 
	public static void main(String[] args){
		Ordenador ordenar = new Ordenador();
		Generador generar = new Generador();
		//String[] vector = generar.llenarArrayAleatorio;
		
		int vector1[] = {6,3,5,2,9,3,4,5,6,4,3,35,3,53,54,36,35,65,6,5,3,5,3,4,63,65,6,64,3,45,6,4,3,5,6,7,5};
		int vector2[] = {8,4,5,7,60,3,4,6,2,6,3,43,54,7,7,5,43,34,65,87,43,5,6,8,4,45,57,7,4,3,534,6,5,76,4,6,8,3};
		 int vector3[] = {8,4,5,7,60,42,33,53,7,3,65,3,4,64,32,53,64,3,42,53,7,2,57,3,4,6,3,2,5,7,8,84,3,2,4,5,7,5};
		 int vector4[] = {8,4,5,7,60,36,34,45,3,2,56,52,26,86,24,68,8,94,3,4,64,2,6,7,4,7,3,2,1,5,7,8,9,3,43,6,3};
		System.out.println("arreglo  desordenado burbuja");
		ordenar.mostrarArreglo(vector1);
		ordenar.burbuja(vector1);
		System.out.println("arreglo ordenado burbuja 2");
		ordenar.burbuja2(vector2);
		ordenar.mostrarArreglo(vector2);

		System.out.println("Arreglo ordenado radix");
		ordenar.mostrarArreglo(vector3);
		System.out.println("Arreglo ordenado con Quick");
		ordenar.quick(vector4,0, vector4.length-1);
		
	}
	
}

