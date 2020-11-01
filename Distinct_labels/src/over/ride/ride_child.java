package over.ride;

import java.io.IOException;

public class ride_child extends ride_parent {

	public static void main(String[] args) {					//if I put throws IOException here =>  Exception IOException is not compatible with throws clause in ride_parent.main(String[])
		// TODO Auto-generated method stub
 ride_child lot= new ride_child();
 lot.sunny(1,"tv");
  
  ride_parent wow = new ride_child();
  wow.sunny(1,"tv");
  
  ride_parent wid = new ride_parent();
  wid.sunny(1,"tv");
  
 /*try {												//Wouldn't I handle this error using try-catch block ?
	 ride_child tit = new ride_parent();				// new ride_parent() ->cannot convert from ride_parent to ride_child.
	  tit.sunny(1,"tv");
	} 													
 catch (Exception e) {
	 System.out.print("This calling is not allowed ro be performed at any cost");
	// TODO: handle exception
}
	}

	public void sunny(int s , String a)
	{System.out.println("transformation is happening");}*/
  
	}
	public void sunny(int s,String a)
	{System.out.println("Branch");}						//How can we put return statement with/without super()
  
}
