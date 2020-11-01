package jon.vs.tuts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws IOException{

		Properties p=new Properties();
	OutputStream fp=new FileOutputStream("Firstdemo.properties");
		
		p.setProperty("name", "Abhijeet");
		p.setProperty("Roll_no", "12");
		p.setProperty("Section", "A");
		p.setProperty("School", "Ryan Intern.");
		p.setProperty("books", "Harry");
		
		p.store(fp, null);		
	}
 
}
