package tareadiseño;

/**
 *
 * @author Anthony Edison Acosta Torres
 */
import java.util.Random;
public class cuentaBancaria {
    private double balance;
    private String cliente;
    private char tipoDeCuenta;
    private String numeroCuenta;
    
    public final char AHORRO = 's';
    public final char CORRIENTE= 'c';
    
    //constructor vacío
    public cuentaBancaria(){        
    }
    
   /* constructor que me recibe como parametro el nombre del cliente y me inicializa
      el balance en cero y el tipo de cuentas en cuenta de ahorro.
   */
   public cuentaBancaria(String cliente){
       balance=0.0;
       tipoDeCuenta=this.AHORRO;
       this.cliente=cliente;
       numeroCuenta=this.generarNumeroCuenta();
       
   }
   
   /*
      Constructor que recibe como parámetro el tipo de cuenta, el nombre del cliente y el
      balance inicial de la cuenta.
   */
   public cuentaBancaria(String cliente, char tipoDeCuenta, double balance){
       this.balance=balance;
       this.tipoDeCuenta=tipoDeCuenta;
       this.cliente=cliente;
       this.numeroCuenta=generarNumeroCuenta();
   }
    
   /*
      Metodos getters and  setters
   */
   
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public char getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(char tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
   
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    /*
    Metodo retirar dinero
    */
    public void retirarDinero(double cantidad){
        if (montoRetiro(cantidad)){
            this.balance=balance-cantidad;            
        }else{
            System.out.println("No se puede retirar la money");
        }
    }
    
    public boolean montoRetiro(double cantidad){
        boolean a;
        if(cantidad>balance){
            a=false;
        }else{
            a=true;
        }
        return a;
    }
    
    /*
    Metodo depositar dinero
    */
    public void depositarDinero(double deposito){
        if(cantidadDeposito(deposito)){
        balance=balance+deposito;
        }else{
            System.out.println("No se puede realizar el deposito; digito invalido");
        }
    }
    
        public boolean cantidadDeposito(double cantidad){
        boolean a;
        if(cantidad <=0){
                  a=false;     
        }else{
            a=true;
        }
        return a;
    }
    
   private String generarNumeroCuenta(){
       
       String tmp="";
       // El primer caracter depende del tipo de cuenta
       //0 si es ahorro
       //1 si es corriente
       if(tipoDeCuenta==AHORRO){
           tmp = "0";
       }else{
           tmp="1";
       }
       
       Random randomGenerator=new Random();
       for(int i = 0; i <=7; ++i){
           tmp=tmp+randomGenerator.nextInt(10);
           /*int randomInt=randomGenerator.nextInt(10);
           convierte el digito a string y lo concadena a la cadena
           tmp=tmp+Integer.toString(randomInt);*/
       }
       return tmp;
   }
   
   public String toString(){
       String mensaje="";
       mensaje += "Numero de cuenta: "+numeroCuenta+"\n";
       mensaje += "Cliente: "+cliente+"\n";
       mensaje += "Balance: "+balance+"\n";
       mensaje += "Tipo de cuenta: "+tipoDeCuenta+"\n";
       if(estaSobregirada()){
           mensaje += "Esta cuenta esta sobregirada";
       }
       //mensaje += "esto es solo una prueba"+"\n";
       return mensaje;
   }    
   
   public boolean estaSobregirada(){
       boolean a;
       if(balance <0){
           a=true;
       }else{
           a=false;
       }
       return a;
   }
   
}
