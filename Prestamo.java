//Lidia Solorzano
//Luis Torres

public class Prestamo implements ICalcula_Interes {
    private double numPrestamo;
    private double tasaInteres;
    private double monPrestamo;
    final double CUOTAS = 36;
    
    
    public Prestamo(int numPrestamo, double tasaInteres, double monPrestamo ) {
        this.numPrestamo = numPrestamo;
        this.tasaInteres = tasaInteres;
        this.monPrestamo = monPrestamo;
    }
    

    @Override
   public double calcularIntereses(){
       double interes;
       interes = monPrestamo * tasaInteres * CUOTAS;
       return interes;
    }

    /**
     *
     */
    @Override
    public void mostrar(){
            System.out.println("Numero de Prestamo: " +numPrestamo +
                               "\n Tasa de Interes: " +tasaInteres+
                                "\n Monto del prestamo: "  +monPrestamo+
                                 "\n Interes: "  +calcularIntereses());
          
    }

}
