//Lidia Solorzano
//Luis Torres
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        int op1, op2;
        String recorrido;
        int numDia;
        double cilin, carga;
        
        
    Scanner leer = new Scanner(System.in);
    
    do{
       System.out.println(" 1.- Alquila Vehiculo  2.- Salir ");
       op1 = leer.nextInt();
       switch (op1){
       case 1:System.out.print(" 1.- Turismo  2.- Deportivo 3.- Furgoneta : ");
               op2 = leer.nextInt();
               switch (op2){
               case 1:leer.nextLine();
                      System.out.print(" Recorrido [local/ foraneo] : ");
                      recorrido = leer.nextLine();
                      System.out.print(" Numero de dias: ");
                      numDia = leer.nextInt();
                      Turismo turismo = new Turismo("KFC-CBV","Blue bird", "Big", "Verde",100000,
                      false, 4, true, recorrido,numDia);
                      turismo.mostrarRegistro();
                      break;
                      
               case 2:System.out.print(" Cilindrada : ");
                      cilin = leer.nextDouble();
                      System.out.print(" Numero de dias: ");
                      numDia = leer.nextInt();
                      Deportivo  deportivo = new Deportivo("KFC-CBV","Blue bird", "Big", "Verde",50000,
                      false, cilin, numDia);
                      deportivo.mostrarRegistro();
                      break;
               case 3:System.out.print(" Cantidad de Kilos de Carga : ");
                      carga = leer.nextDouble();
                      System.out.print(" Numero de dias: ");
                      numDia = leer.nextInt();
                      Furgoneta furgoneta = new Furgoneta("KFC-CBV","Blue bird", "Big", "Verde",90000,
                      false, carga, 111, numDia);
                      furgoneta.mostrarRegistro();
                      break; 
               }//op2      
       }//op1
       
    
    }while (op1 != 2);
  }//main
    
}//class
