package Random.img;

import java.util.Scanner;

public class mediaPosNeg {

	//Introducir diez números enteros y sacar por pantalla las medias de los números positivos y de los negativos.
	//Main
	public static void main(String[] args) {
		
		//Creamos objeto teclado de la clase Scanner
		Scanner teclado= new Scanner(System.in);
		
		//Declaramos array
		int[] numero= new int[10];
		//Declaramos e incializamos variables
		int pos=0,neg=0;//pos=número de números positivos/neg=número de números negativos
		int i;//variable del bucle for
		float sumaPos=0f, sumaNeg=0f;//sumaPos=suma de todos los números positivos introducidos/sumaNeg=suma de todos los números negativos introducidos
		
		//Introducimos datos por pantalla
        System.out.println("Introduzca un número: ");
        for (i = 0; i < numero.length; i++) {//Se rellena el array desde que el elemento i(número de elemento) está en cero hasta que hay 10 elementos y de uno en uno.
            System.out.print("numero[" + i + "]= ");//Para saber porque número vamos
            numero[i] = teclado.nextInt();//Se guarda en el array el número introducido, gracias al objeto teclado de la clase Scanner
            
        }
        //for para que vaya sumando y contando número positivos y negativos
        for (i=0;i<numero.length;i++){//Este for pasa por cada elemento del array y...
        	if(numero[i]<0){//...si un elemento es negativo...
        		sumaNeg=sumaNeg+numero[i];//...lo suma a sumaNeg...
        		neg++;//...añade uno al contador de números negativos
        	}else if  (numero[i]>0){//hace lo mismo con los positivos:
        		sumaPos=sumaPos+numero[i];
        		pos++;
        	}
        	
        	//Saca datos por pantalla:
        	if(pos!=0){
        		System.out.println("La media de los número positivos es "+sumaPos/pos);	
        	}else{
        		System.out.println("No ha introducido ningún número positivo");
        	}
        	if(neg!=0){
        	System.out.println("La media de los número negativos es "+sumaNeg/neg);
        	}else{
        		System.out.println("No ha introducido ningún número negativo");
        	}
        	teclado.close();
        }


	}

}
