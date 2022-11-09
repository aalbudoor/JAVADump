package RemoteDeploymentWithRMI;
//class ServiceServerImnp (the remote implementation)

import java.rmi.*;
import java.util.*;
import java.rmi.server.*;

public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {
	
	//The services will be stored in a Hashmap collection. instead of putting ONE object in the collection, you put TWO 
	//-- a key object (like a string) and a value object (whetever you want)
	HashMap ServiceList;
	
	public ServiceServerImpl() throws RemoteException {
		setUpServices();
	}
	
	private void sertUpService() {
		//when the constructor is called initialise the actual universal services
		
		//Make the services (the actual service objects) and put them into the HAshMap, with a String name (for the "key")
		serviceList = new HashMap();
		serviceList.put("Dice Rolling service", new DiceService());
		serviceList.put("Day of the week Service", new DayOfTheWeekService());
		
	}
	
	public Object[] getServiceList() {
		//client calls this in order to get a list of services to display in the browser (so the user can select one).
		//we send an array of type Object (even tough it has Strings inside) by making an array of just the Keys
		//that are in the HashMap. We wont send an actual Service object unless the 
		//cleint asks for it by calling getService()
		System.out.println("in remote");
		return serviceList.keySet().toArray();
		
	}
	
	public Service getService(Object serviceKey) throws RemoteException {
		//client calls this method after the user selects a service from the displayed list of services (that it got from the method above). 
		//this code uses the key (the same key originally sent to the client) to get the corresponding service out of the AhshMap
		Service theService = (Service) serviceList.get(serviceKey);
		return theService;
	}
	
	public static void main (String[] args) {
		
		try {
			Naming.rebind("ServiceServer", new ServiceServerImpl());
		} catch(Exception ex) {
			ex.printStackTrace(); 
		}
		System.out.println("Remote service is running");
		
		}
	}


