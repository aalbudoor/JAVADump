package RemoteDeploymentWithRMI;
//class ServiceBrowser (the client)

import java.awt.*;
import javax.swing.*;
import java.rmi.*;
import java.awt.event.*;

public class ServiceBrowser {
	
	JPanel mainPanel;
	JComboBox serviceList;
	ServiceServer server;
	
	public void buildGUI() {
		JFrame frame = new JFrame("RMI Browser");
		mainPanel = new JPanel();
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		
		
		Object[] services = getServicesList();	//this method does the RMI registery lookup, gets the stub, and calls getServiceList().
		
		serviceList = new JComboBox(services);	//add the services (an array of objects) to the JcomboBox (the list). 
												//The JComboBox knows how to make displayable strings out of each thing in the array
		
		serviceList.addActionListener(new MyListListener());
		
		frame.setSize(500,500);
		frame.setVisible(true);
		
		
	}
	
	void loadService(Object serviceSelection) {
		//heres wher we add the actual service to the GUI, after the user has selected one. (This method is called by the event listener in the JcomboBox).
		//we call getService(0 on the remote server (the stub for serviceServer) and pass it the String that 
		//was displayed in the list (which is the same String we originally got from the server when we called getServiceList())
		//The server returns the actual service (serialized), which is automatically deserialized (thanks to RMi) 
		//and we simply call the getGuiPanle() on the service and add the result (a JPanle) to the browsers mainPanel
		try {
			Service svc = server.getService(ServiceSelection);
			
			mainPanel.removeAll();
			mainPanel.add(svc.getGuiPanel());
			mainPanel.validate();
			mainPanel.repaint();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	Object[] getServiceList() {
		Object obj = null;
		Object services = null;
		
		try {				//do the rmi look up and get the stub
			obj = Naming.lookup("rmi://127.0.0.1/ServiceServer");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
			
		//cast the stub to the remote interface type, so that we can call getServiceList() on it
		server = (ServiceServer) obj;
		
	
	
	try {
							//getServicesList() gives us the array of Objects, that we display in the JComboBox fot the user to select from
		services = server.getServiceList();
		
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	
	return services;

}

	class MyListListener implements ActionListener {
		public void actionPerfromed(ActionEcent ev) {
			
			Object selection = serviceList.getSelectItem();
			loadService(selection);		//If were here it means te user made a selection from the JComboBoc 
										//list so take the selection they made and load the appropriate service (see the loadService method,
										//that asks the server fot the service that correspinds with this selection)
		}
	}

	public static void main (String[] args) {
		new ServiceBrowser().buildGUI();
	}

}
