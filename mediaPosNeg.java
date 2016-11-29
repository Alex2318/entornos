package Random.img;

import java.util.Scanner;

public class mediaPosNeg {

	//Introducir diez n�meros enteros y sacar por pantalla las medias de los n�meros positivos y de los negativos.
	//Main
	public static void main(String[] args) {
		
		//Creamos objeto teclado de la clase Scanner
		Scanner teclado= new Scanner(System.in);
		
		//Declaramos array
		int[] numero= new int[10];
		//Declaramos e incializamos variables
		int pos=0,neg=0;//pos=n�mero de n�meros positivos/neg=n�mero de n�meros negativos
		int i;//variable del bucle for
		float sumaPos=0f, sumaNeg=0f;//sumaPos=suma de todos los n�meros positivos introducidos/sumaNeg=suma de todos los n�meros negativos introducidos
		
		//Introducimos datos por pantalla
        System.out.println("Introduzca un n�mero: ");
        for (i = 0; i < numero.length; i++) {//Se rellena el array desde que el elemento i(n�mero de elemento) est� en cero hasta que hay 10 elementos y de uno en uno.
            System.out.print("numero[" + i + "]= ");//Para saber porque n�mero vamos
            numero[i] = teclado.nextInt();//Se guarda en el array el n�mero introducido, gracias al objeto teclado de la clase Scanner
            
        }
        //for para que vaya sumando y contando n�mero positivos y negativos
        for (i=0;i<numero.length;i++){//Este for pasa por cada elemento del array y...
        	if(numero[i]<0){//...si un elemento es negativo...
        		sumaNeg=sumaNeg+numero[i];//...lo suma a sumaNeg...
        		neg++;//...a�ade uno al contador de n�meros negativos
        	}else if  (numero[i]>0){//hace lo mismo con los positivos:
        		sumaPos=sumaPos+numero[i];
        		pos++;
        	}
        	
        	//Saca datos por pantalla:
        	if(pos!=0){
        		System.out.println("La media de los n�mero positivos es "+sumaPos/pos);	
        	}else{
        		System.out.println("No ha introducido ning�n n�mero positivo");
        	}
        	if(neg!=0){
        	System.out.println("La media de los n�mero negativos es "+sumaNeg/neg);
        	}else{
        		System.out.println("No ha introducido ning�n n�mero negativo");
        	}
        	teclado.close();
        }


	}

}
