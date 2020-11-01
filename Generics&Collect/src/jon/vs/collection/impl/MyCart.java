package jon.vs.collection.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection Col= new ArrayList();
	
			Col.add(5);
			Col.add(6.6);
			Col.add("strive");
			
			for(Object o:Col)
			{
				System.out.println("print" +" "+o);
			}
		

	}

}
