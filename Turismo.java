
//Lidia Solorzano
//Luis Torres
public class Turismo extends Vehiculo{
    private int numPue;
    private boolean tipoMar;
    private String recorrido;
    private int numDia;

    
    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, boolean disp,
                   int numPue, boolean tipoMar, String recorrido, int numDia) {
        super(matricula, marca, modelo, color, tarifa, disp);
        this.numPue = numPue;
        this.tipoMar = tipoMar;
        this.recorrido = recorrido;
        this.numDia = numDia;
    }

    
    

    @Override
    public void mostrarRegistro(){
    System.out.println("");
    System.out.println("");
    System.out.println("*******************************************************************************************************************************************");
    System.out.println("Categoría del vehículo: Turismo");        
    System.out.println("*****************************************************************************************************************************************");
    System.out.println("|Matricula : " +getMatricula()+"| Marca : " +getMarca()+"| Modelo : " +getModelo()+
                      " |Color : " +getColor()+" |Tarifa : " +getTarifa()+"| Disponibilidad : " +getDisp() + 
                      "|Numero de Puertas: " + numPue + "|Marcha Automatica: " + tipoMar);
    System.out.println("****************************************************************************************************************************************");
    System.out.println("");
    System.out.println("");
    System.out.println("Total a Pagar: " + calMon());
}

    @Override
    public double calMon(){
    double pago;
        if (recorrido.equalsIgnoreCase("Local")){
            pago = numDia * getTarifa();
        }else{
            pago = numDia * getTarifa()+ numDia * getTarifa()* 0.15;
        }
        return pago;
}
    
    
    
    public int getNumPue() {
        return numPue;
    }

    public void setNumPue(int numPue) {
        this.numPue = numPue;
    }

    public boolean getTipoMar() {
        return tipoMar;
    }

    public void setTipoMar(boolean tipoMar) {
        this.tipoMar = tipoMar;
    }

    public String getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(String recorrido) {
        this.recorrido = recorrido;
    }

    public int getNumDia() {
        return numDia;
    }

    public void setNumDia(int numDia) {
        this.numDia = numDia;
    }

 

}// turismo

