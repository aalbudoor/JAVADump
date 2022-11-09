package SerializationAndFileIO;

import java.io.*;
		
		class DungeonGame implements Serializable {
			public int x = 3;
			transient long y = 4;
			private short z = 5;
			
			int getX() {
				return x;
			}
			
			short getZ() {
				return z;
			}
			
			long getY() {
				return y;
			}
				
			}
		
		class DungeonTest {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			DungeonGame d = new DungeonGame();
			System.out.println(d.getX() + d.getZ() + d.getY());
			
			try {
				FileOutputStream fos = new FileOutputStream("dg.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(d);
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			try {
				FileInputStream fis = new FileInputStream("dg.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				d = (DungeonGame) ois.readObject();
				ois.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(d.getY());//Serialization proccess skips the variable Y thus the state of the object is 0;
			
			System.out.println(d.getX() + d.getZ() + d.getY());
			
		}

		

	

}
