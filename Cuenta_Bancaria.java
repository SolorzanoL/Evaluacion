//Lidia Solorzano
//Luis Torres

public abstract class Cuenta_Bancaria implements ICalcula_Interes {
    protected  String numero;
    protected double saldo;
    protected double tasaInteres;

   
    public Cuenta_Bancaria(String numero, double saldo, double tasaInteres) {
        this.numero = numero;
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }
     
   
    
    public void acreditar_Saldo{double saldoAcreditable){
        saldo += saldoAcreditable;
    }

    public void debitar_Saldo{double saldoDebitable){
        saldo -= saldoDebitable;
    }
 
}
