/* Servidor de rmi*/

//Tenemos que hacer es ejecutar un programa java que instancie y registre el objeto remoto
import java.rmi.Naming;
public class CalculatorServer {
 public CalculatorServer(){
  try {
  	//Instanciar una clase remota y luego registrarla en rmiregistry
  Calculator c = new CalculatorImpl();
  //La instanciación no tiene problemas.
  //Para registrarla hay que llamar al método estático rebind() de la clase Naming.
   //Se le pasan dos parámetros. Un nombre para poder identificar el objeto y una instancia del objeto.
   // El nombre que hemos dado debe conocerlo el cliente, para luego poder pedir la instancia por el nombre.
   // El método rebind() registra el objeto en rmiregistry.
  	// Si ya estuviera registrado, lo sustituye por el que acabamos de pasarle.
  Naming.rebind("rmi://localhost:1099/CalculatorService", c);
  } catch (Exception e) {
  System.out.println("Hay algún problema: " + e);
  }
 }
 public  static void main(String args[]) {
  new CalculatorServer();
 }
}
      