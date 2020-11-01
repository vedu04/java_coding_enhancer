package jon.vs.serial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class strore_obj {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("Cricketscore.text");
		FileOutputStream out= new FileOutputStream(f);
		ObjectOutputStream d=new ObjectOutputStream(out);
		
		Fun fun=new Fun();
		fun.i=10;
		d.writeObject(fun);
		
	}
	

}


class Fun implements Serializable
{
	int i=7;
	}