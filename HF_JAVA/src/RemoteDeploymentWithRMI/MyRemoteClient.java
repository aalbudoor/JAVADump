package RemoteDeploymentWithRMI;


//Complete client code

//the client must have the stub class (that you generated earlier using rmic) at the time the client does the look up , or else the stub wont be
//desiralized on the client and the whole thing blows up, you can simply hand deliver the stub class to the client 


import java.rmi.*;

public class MyRemoteClient {
	
	public static void main (String[] args) {
		new MyRemoteClient().go();
		
	}
	
	public void go() {
		
		try {
			//it comes out the registery as type object so dont forget to cast
			
			//you need the ip address or host name and the name to use to bind/rebinf the service (/Remote Hello)
			
			
			MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote Hello");
			
			
			//it looks just like a regular old method call! (Rxcept it acknowledges the RemoteException)
			String s = service.sayHello();
			
			System.out.println(s);
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
