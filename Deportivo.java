//Lidia Solorzano
//Luis Torres

public class Deportivo extends Vehiculo{
    private double cilin;
    private int numDia;

    
     public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, boolean disp,
                    double cilin, int numDia) {
        super(matricula, marca, modelo, color, tarifa, disp);
        this.cilin = cilin;
        this.numDia = numDia;
    }

    @Override
    public void mostrarRegistro(){
    System.out.println("");
    System.out.println("");
    System.out.println("***************************************************************************************************************************************");
    System.out.println("Categoría del vehículo: Depotivo ");        
    System.out.println("***************************************************************************************************************************************");
    System.out.println("|Matricula : " +getMatricula()+"| Marca : " +getMarca()+"| Modelo : " +getModelo()+
                      "| Color : " +getColor()+"| Tarifa : " +getTarifa()+"| Disponibilidad : " +getDisp() + 
                      "|Cilindrada : " + cilin);
    System.out.println("***************************************************************************************************************************************");
    System.out.println("");
    System.out.println("");
    System.out.println("Total a Pagar: " + calMon());
    }
   
    @Override
    public double calMon(){
       return getTarifa() * numDia;
    }
    
    
    
    public double getCilin() {
        return cilin;
    }

    public void setCilin(double cilin) {
        this.cilin = cilin;
    }

    public int getNumDia() {
        return numDia;
    }

    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }
    
}
