
/*La interface de la clase remota*/

//Lo primero que tenemos que hacer es una interface con los m�todos que queremos que se puedan llamar remotamente.
 //Esta interface ser�a como la siguiente
public interface Calculator extends java.rmi.Remote {
	//operaci�n suma y cachamos error
  public long add(long a, long b)
   throws java.rmi.RemoteException;
}

//Tiene que heredar de la interface Remote de java, si no el objeto no ser� remoto. 
//A�ade adem�s los m�todos que queramos, pero todos ellos deben lanzar la excepci�n java.rmi.RemoteException,
//que se producir� si hay alg�n problema con la comunicaci�n entre los dos ordenadores o cualquier otro problema interno de rmi o en el servidor.