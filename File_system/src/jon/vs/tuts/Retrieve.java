package jon.vs.tuts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Retrieve {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Properties p=new Properties();
			InputStream io=new FileInputStream("Firstdemo.properties");
		p.load(io);
		System.out.println(p.getProperty("book"));
	}

}
