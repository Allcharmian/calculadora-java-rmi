
/*La interface de la clase remota*/

//Lo primero que tenemos que hacer es una interface con los métodos que queremos que se puedan llamar remotamente.
 //Esta interface sería como la siguiente
public interface Calculator extends java.rmi.Remote {
	//operación suma y cachamos error
  public long add(long a, long b)
   throws java.rmi.RemoteException;
}

//Tiene que heredar de la interface Remote de java, si no el objeto no será remoto. 
//Añade además los métodos que queramos, pero todos ellos deben lanzar la excepción java.rmi.RemoteException,
//que se producirá si hay algún problema con la comunicación entre los dos ordenadores o cualquier otro problema interno de rmi o en el servidor.