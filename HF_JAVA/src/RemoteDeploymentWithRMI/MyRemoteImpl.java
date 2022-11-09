package RemoteDeploymentWithRMI;

//The Remote service (The implementation)

import java.rmi.*;
import java.rmi.server.*; //UnicastRemoteObject is in the java.rmi.server package

								//extending unicastRemoteObject is the way to make a remote object and you must implement your remote interface
public class MyRemoteImpl  extends UnicastRemoteObject implements MyRemote {
	
	//You have to implement all the interface methods, of course. but notice that you do NOT have to declare the RemoteException
	public String sayHello() {
		return "Server says, Hello ";
	}
	
	
	//your superclass constructor (for unicastRemoteObject) declares an exception, so YOU must write a constructor, because it means that your 
	//constructor is calling risky code (its super class constructor)
	public MyRemoteImpl() throws RemoteException { }
	
	
	public static void main (String[] args) {
		
		try  {
			MyRemote service = new MyRemoteImpl();		//make the remote object then bind it to the rmiregistery using the static Naming.rebing().
			Naming.rebind("Remote Hello", service);		//the name you register it under us the name clients will need to loook up in the rmi registery
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
