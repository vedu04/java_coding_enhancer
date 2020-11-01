package jon.vs.Redd_pro_vardemo;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("If u r Foody,Kindly select one of the cases below");
		  int i=10;
		//switch (i)		//only convertible int values,strings or enum variables are permitted.
	 // switch(i<12)				//cannot switch on a value of type boolean.Only convertible int values,strings or enums are permitted.
		switch(i)
	  {
		
		/*case 0:System.out.println("maggi");
		case 1: System.out.println("Pizza");
		case 2:System.out.println("Burger");
		case 5:System.out.println("Long");
		default: System.out.println("No_Food");
				} */
	  
	case 0:System.out.println("maggi"); break;
	case 1: System.out.println("Pizza"); break;
	case 2:System.out.println("Burger"); break;
	case 5:System.out.println("Long");  break;
	default: System.out.println("No_Food");
			}


	}

}
