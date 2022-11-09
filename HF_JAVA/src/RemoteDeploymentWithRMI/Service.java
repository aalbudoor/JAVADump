package RemoteDeploymentWithRMI;
//interface Service (What the gui services implement)

//A plain old(i.e non-remote) interface, that defines the one method that any universel service must have - getGuiPane(). The interface extends
//Serializable, so that any class implementing the service interface will automatically be serializable.

//Thats a must becauce the services get shipped over the wire from the server, as a result of 
//the client calling getService() on the remote ServiceServer

import javax.swing.*;
import java.io.*;


public interface Service  extends Serializable {
	
		public JPanel getGuiPanel();
}
