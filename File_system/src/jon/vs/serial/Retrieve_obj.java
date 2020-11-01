package jon.vs.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Retrieve_obj {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     File foo=new File("Cricketscore.text");
     FileInputStream fs=new FileInputStream(foo);
     ObjectInputStream oo=new ObjectInputStream(fs);
     Fun f1=(Fun)oo.readObject();
     System.out.println(f1.i);
     
	}

}
