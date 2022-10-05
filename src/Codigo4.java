import java.util.Scanner;//importamos la clase scanner porque si no, nos marcara error
public class Codigo4 {
	public static void main(String[] args) {//agregamos main para poder ejecutar las pruebas
    Scanner s = new Scanner(System.in);//crea un objeto scanner s insertamos system.in para iindicar de donde proceden los datos, en este caso del teclado.
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);//crea un objeto escaner s2 insertamos system.in para iindicar de donde proceden los datos, en este caso del teclado.
    String j2 = s2.nextLine();
    j1=j1.toLowerCase();//agregamos esta codigo de la linea para que devuelva el valor de la cadena que realiza la llamada.
    j2=j2.toLowerCase();//agregamos esta codigo de la linea para que devuelva el valor de la cadena que realiza la llamada.
    if ((j1.equals(j2))) {//aqui borramos un parentesis que estaba de mas y agregamos equals y quitamos ==
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {//agregamos equals y quitamos ==
            g = 1;
          }
        case "papel":
          if (j2.equals("piedra")) {//agregamos equals y quitamos ==
            g = 1;
          }//aqui faltaba una llave que cierra el if
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          
          break;

        default:
      }//switch
      System.out.println("Gana el jugador " + g);
    }
  
  

	}//main
}// class Codigo4