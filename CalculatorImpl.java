
/*El objeto remoto*/

//Hay que hacer una clase que implemente esa InterfaceRemota, es decir, 
//que tenga los métodos que queremos llamar desde un cliente rmi.
//El servidor de rmi se encargará de instanciar esta clase y de ponerla a disposición de los clientes. 
public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Calculator {
  // Las implementaciones deben tener 
  // un constructor explícito 
  // para poder declarar
  // la excepción RemoteException
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