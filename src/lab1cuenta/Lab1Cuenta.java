
package lab1cuenta;

public class Lab1Cuenta {
    
  private String nombre;
  private String nroCuenta;
  private double interes;
  private double saldo;
  
  public Lab1Cuenta(){
      
      
  }

    public Lab1Cuenta(String nombre, String nroCuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
   public boolean ingreso(double importe){
       if(importe > 0){
           saldo += importe;
           
           return true;
       }else {
           return false;
       }
   }
   
   public boolean extraccion(double importe){
       if(importe > 0 && saldo >= importe){
           saldo -= importe;
           
           return true;
       }else {
           return false;
       }
       }
   public boolean transferencia(Lab1Cuenta cuentaDestino, double importe){
           
        if( extraccion(importe) && cuentaDestino.ingreso(importe)){
            
            return true;
        }else{
            return false;
        }
       
       
   }
   
    
}
