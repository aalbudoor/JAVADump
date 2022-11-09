package RemoteDeploymentWithRMI;


// complete code for the server side

//The remote interface

import java.rmi.*;		//RemoteException and Remote interface are in java.rmi package

	public interface MyRemote extends Remote {		//Your interface MUST extend java.rmi.Remote
		
		public String sayHello() throws RemoteException;		//All of yout remote methods must declare a RemoteExceotion
		
	}


