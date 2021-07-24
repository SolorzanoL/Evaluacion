//Lidia Solorzano
//Luis Torres

public class CuentaAhorro extends Cuenta_Bancaria{
    private final Double PERIODO = 365;
    private double resultado =0;

    public CuentaAhorro(String numero, double saldo, double tasaInteres) {
        super(numero, saldo, tasaInteres);
    }
    
    @Override
    public double calcular_Intereses(){
       interes = saldo *(1 + (tasaInteres /PERIODO))* PERIODO;
       return resultado;
    }
    
     @Override
     public void mostrar(){
            System.out.println("Numero de cuenta: " +numero +
                               "\n Saldo: "  +saldo +
                               "\n Tasa de Interes: " +tasaInteres);
      
    } 
     
    
}
