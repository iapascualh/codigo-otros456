import java.util.Scanner;//importamos el java util del Scanner para poder utilizarlo correctamemnte 
public class codigo6 {
	public static void main (String [] args) {//agregamos una clase main para ejecutar el ejercicio
	    int[] n = new int[20];// agregamos new para denotar que estamos declarando algo nuevo

	    for (int i = 0; i < 20; i++) {//hace falta un sigmno de suma para el incrementador
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " ");//falta la palabra out para que este bien escrito la impresion
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? ");//falta agregarle una letra a la palabra println para el salto de linea
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    Scanner s = new Scanner(System.in);//agregamos el metodo de scanner para declara una variable 
	    int opcion = Integer.parseInt(System.console().readLine());//falta el parentesis de cierre

	    int multiplo = (opcion == 1) ? 5 : 7;//estan mal colocado los :?

	    for (int e : n) {// creamos un for en vez de foreach y el char lo sustituimos por int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }//aqui faltaba un corchete de cierre del if
	      else {
	        System.out.print(e + " ");// cambiamos in por out
	      }//if else
	    }//for
	  
	}//main
}//class codigo6