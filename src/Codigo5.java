import java.util.Scanner;//importamos el java util del Scanner para poder utilizarlo correctamemnte 

public class Codigo5 {
	public static void main (String[] args) {//agregamos un main para poder ejecutar las pruebas
	    Scanner s = new Scanner(System.in);//insertamos system.in para indicar de donde proceden los datos, en este caso del teclado.
	    System.out.print("Introduzca un número: ");//debemos quitar las comillas despues del punto y coma para que no lo considere como un String y lo sustituimosen la comilla simple para una correcta syntaxis
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni);//agregaremos un integer .parseint para indicar que el argumento de tipo cadena devuelvera un entero de la base especificada.
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) {//aqui la variable debe de ser c y no ni por eso nos arroja un error
		  int digito = (int)(c % 10);//igual que en la linea anterior aqui la variable de comparacion debe de ser c para evitar el error de syntaxis
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }//if else
		  c /= 10;//corregimos la variable de comparacion
	   
		}//while//colocamos el cierre del while aqui para evitar que se repita el resultado
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado.");//aqui existe un error de escritura de la etiqueta println, falta la t ademas debemos cambiar la variable c por ni, si no no nos arrojara el resultado deseado
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");//aqui debemos cambiar la variable c por ni, si no no nos arrojara el resultado deseado
	    }//if else afo
	    
	  
	  
	}//main
}//class Codigo5