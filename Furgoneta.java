//Lidia Solorzano
//Luis Torres
public class Furgoneta extends Vehiculo{
    private double carga;
    private double volumen; 
    private int numDia;

    
     
    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, boolean disp,
                   double carga, double volumen, int numDia) {
        super(matricula, marca, modelo, color, tarifa, disp);
        this.carga = carga;
        this.volumen = volumen;
        this.numDia = numDia;
    }

    
    

    @Override
    public void mostrarRegistro(){
    System.out.println("");
    System.out.println("");
    System.out.println("**************************************************************************************************************************************************");
    System.out.println("Categoría del vehículo: Furgoneta");        
    System.out.println("***************************************************************************************************************************************************");
    System.out.println("|Matricula : " +getMatricula()+ "| Marca : " +getMarca()+"| Modelo : " +getModelo()+
                      " |Color : " +getColor()+"| Tarifa : " +getTarifa()+" |Disponibilidad : " +getDisp() + 
                      "| volumen metros cúbicos  :" + volumen);
    System.out.println("***************************************************************************************************************************************************");
    System.out.println("");
    System.out.println("");
    System.out.println("Total a Pagar: " + calMon());
}

    @Override
    public double calMon(){
    double pago;
        if ( carga <= 600){
            pago = numDia * getTarifa();
        }else{
            pago = numDia * getTarifa()+ numDia * getTarifa()* 0.25;
        }
        return pago;
}
    
    
    
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getNumDia() {
        return numDia;
    }

    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }

 }

