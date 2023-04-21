
package lab1cuenta;


public class cuentaApp {
    
    public static void main(String[] args) {
        
        Lab1Cuenta c1 = new Lab1Cuenta("Pepe", "78109", 7.0, 1000);
        Lab1Cuenta c2 = new Lab1Cuenta ();
        c2.setNombre("Lionel");
        c2.setNroCuenta("1007");
        c2.setInteres(18.12);
        c2.setSaldo(2005);
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
        
        System.out.println("Ingreso");
        
        c1.ingreso(2000);
        c2.ingreso(5000);
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
        
        c1.extraccion(450);
        c2.extraccion(3005);
        
        System.out.println("Extraccion");
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
        
        c1.transferencia(c2, 250);
        
        System.out.println("Transferencia de c1 a c2");
        
        System.out.println("El saldo actual de c1 es: " + c1.getSaldo());
        System.out.println("El saldo actual de c2 es: " + c2.getSaldo());
       
    }
    
    
   
    
}
