
/*El objeto remoto*/

//Hay que hacer una clase que implemente esa InterfaceRemota, es decir, 
//que tenga los m�todos que queremos llamar desde un cliente rmi.
//El servidor de rmi se encargar� de instanciar esta clase y de ponerla a disposici�n de los clientes. 
public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Calculator {
  // Las implementaciones deben tener 
  // un constructor expl�cito 
  // para poder declarar
  // la excepci�n RemoteException
  public CalculatorImpl()
   throws java.rmi.RemoteException {
  super();
  } 
  	//metodo que realiza la operacion de suma a+b
  public long add(long a, long b)
   throws java.rmi.RemoteException {
  return a + b;
  }
  
  }