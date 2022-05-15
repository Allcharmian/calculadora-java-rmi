
/* Cliente de RMI*/

//Tenemos que hacer el programa que utilice este objeto de forma remota
import java.rmi.Naming;
import java.rmi.RemoteException; 
import java.net.MalformedURLException;      
import java.rmi.NotBoundException; 
public class CalculatorClient {
 public static void main(String[] args) {
 try { 
    Calculator c = (Calculator) 
    //se llama al m�todo est�tico lookup() de la clase Naming. 
    //Se le pasa a este m�todo la URL del objeto. Esa URL es el nombre (o IP) del host donde est� arrancado rmiregistry 
    //y por �ltimo el nombre con el que se registr� anteriormente el objeto (en mi caso ObjetoRemoto).
    Naming.lookup("rmi://localhost/CalculatorService");
    System.out.println( c.add(18, 3) );
  } catch (MalformedURLException murl) {
    System.out.println("URL Mal "+murl);
    
  } catch (RemoteException re) {
    System.out.println("RemoteException"+re);
  } catch (NotBoundException nbe) {
    System.out.println("NotBoundException"+nbe);
  } catch (java.lang.ArithmeticException ae) {
    System.out.println("java.lang.ArithmeticException"+ae);
  }
 }
}
      