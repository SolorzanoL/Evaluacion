//Lidia Solorzano
//Luis Torres
import java.util.Scanner;


public class Programa_Interes {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    ICalcula_Interes[] ici = new ICalcula_Interes[3];
    
    ici[0]= new Prestamo(1, 12.5,5000);
    ici[0].mostrar();
    
  }//main
    