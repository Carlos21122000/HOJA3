/**
* @author Carlos Raxtum 19721
* älgoritmos y estructura de datos
*/ 

public class Ordenador {
	int i, j, temporal;
	public Ordenador(){
		this.i=0;
		this.j=0;
		this.temporal=0;
	}
	//metodo burbuja version1
	public void burbuja (int[] arreglo) {
		for(i=0;i<arreglo.length;i++) {
			for(j=i+1;j<arreglo.length;j++) {
				if(arreglo[i]>arreglo[j]) {
					temporal = arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=temporal;
				}
			}
		}
	}
	
	
	//metodo burbuja version1
	public void burbuja2 (int[] arreglo) {
		for(i=1;i<arreglo.length;i++) {
			for(j=0;j<arreglo.length-1;j++) {
				if(arreglo[j]>arreglo[j+1]) {
					temporal = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=temporal;
				}
			}
		}
	}
	
	
	//Metodo Radix
	public void radix (int[] arreglo) {
		int x,i,j;
		for (x=Integer.SIZE-1;x>=0;x++) {
			int auxiliar[] = new int [arreglo.length];
			j=0;
			for(i=0;1<arreglo.length;i++) {
				boolean mover = arreglo[i] << x >=0;
				if(x==0? !mover:mover) {
					auxiliar[j]=arreglo[i];
					j++;
				}else {
					arreglo[i-j]=arreglo[i];
				}
			}
			for(i=j;i<auxiliar.length;i++) {
				auxiliar[i]=arreglo[i-j];
			}
			arreglo =auxiliar;
		}
		System.out.println("El arreglo Ordenado con radix es:");
		mostrarArreglo(arreglo);
	}
	
	//metodo quick
	public void quick(int[] arreglo, int primero, int ultimo) {
		int i,j,pivote,auxiliar;
		i=primero;
		j=ultimo;
		pivote = arreglo[(primero+ultimo)/2];
		do{
			while(arreglo[i]<pivote) {
				i++;
			}
			while(arreglo[j]>pivote) {
				j--;
			}
			if(j>=i) {
				auxiliar=arreglo[i];
				arreglo[i]=arreglo[j];
				arreglo[j]=auxiliar;
				i++;
				j--;
			}
		}while(i<=j);
		if(primero<j) {
			quick(arreglo,primero,j);
		}
		if(i<ultimo) {
			quick(arreglo, i,ultimo);
		}
		System.out.println("El arreglo Ordenado con quick es:");
		mostrarArreglo(arreglo);
	}
	//Metodo merge sort
	public int[] merge(int[] arreglo) {
		int i, j, k;
		if (arreglo.length> 1) {
			int nElementosIzq=arreglo.length/2;
			int nElementosDer=arreglo.length-nElementosIzq;
			
			int arregloIzq[]= new int[nElementosIzq];
			int arregloDer[] = new int [nElementosDer];
			
			//copiando elementos de parte primera al arregloizq
			for (i=nElementosIzq;i<nElementosIzq+nElementosDer; i++) {
				arreglo[i-nElementosIzq]=arreglo[i];
			}
			arregloIzq=merge(arregloIzq);
			arregloDer=merge(arregloDer);
			i=0;
			j=0;
			k=0;
			while(arregloIzq.length!=j && arregloDer.length !=k) {
				if (arregloIzq[j] < arregloDer[k]){
					arreglo[i]=arregloIzq[j];
					i++;
					k++;
				}else {
					arreglo[i]=arregloDer[k];
					i++;
					k++;
				}
			}
			//arreglo final
			while(arregloIzq.length!=j) {
				arreglo[i]= arregloIzq[j];
				i++;
				j++;
			}
			while(arregloDer.length != k) {
				arreglo[i]=arregloDer[k];
				i++;
				k++;
			}
		}
		return arreglo;
	}
	
	
	//Metodo Mostrar	
	public void mostrarArreglo(int[] arreglo) {
		int k;
		for(k=0; k< arreglo.length;k++) {
			System.out.println("("+ arreglo[k] +")");
		}
	}
}
