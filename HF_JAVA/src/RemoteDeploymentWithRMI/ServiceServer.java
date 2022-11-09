package RemoteDeploymentWithRMI;


//inter face ServiceServer ( the remote interface) 

import java.rmi.*;
	
public interface ServiceServer  extends Remote {
	
	// A normal RMi remote interface defines two methods the remote service will have
	
	Object[] getServiceList() throws RemoteException ; 
	
	Service getService(Object serviceKey) throws RemoteException;
	

}
