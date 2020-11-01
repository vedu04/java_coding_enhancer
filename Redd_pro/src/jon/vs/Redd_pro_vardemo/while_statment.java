package jon.vs.Redd_pro_vardemo;

public class while_statment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* float d=10.0f;
  while (d) {
  System.out.println("Navin ");	
}*/         //cannot convert float to boolean. This error is shown cause while loop always takes true/boolean as a parameter.
  
		/*int i=5;
		while (i)			//type mismatch:cannot convert from int to boolean
		{System.out.println("hi");}*/
		
		/*while	()		// while paramater can't be blank.
		 System.out.println("Random");*/
		 
	/*	//boolean f=false;
		while(true)			//while can take boolean values (true or false) only => 0 / 1 is also not allowed to be passed in while
		{System.out.println(5);}*/
	
		/*int j=210;
		while ((j++)<214) {						//j++ is prforming like as j's value execute statement and then gets iterated to new value( to fulfil condition) and execute.

			System.out.println("Good!");
			System.out.println("Congrats! Welcome Onboard");
		}*/
		
		/*int u=34;
		while ((u=u--)>=34) {							//As we know that, u(here) always uses the assigned vale firstly(to check the condition here) and then iterate(inc/dec)  the var value to new value.But we also know that if a single line statement ,once var assigns value to var(u=u first) and then incr/dec, so, var is assigned a permant value,hence permanent value is used for further processing(here, condition check), and the temp stored(inc/decremented value has no use for further manipulation)/discarded.
														//Only assigned var has part to play for further processing/calculation
			System.out.println("Star");
		}*/
		
		//AAbove same works for while((u=u++)<=36){}  // 34 ek bar assign ho gya to "u" then,ye condition always same (true) rh jaegi hr ek iteration me( cause var incr. to ho hi ni paega.
													  //hmesa "u" ko 34 hi assigned hogi(coz assignment is given priority over inc/dec) aur islie infinite loop chlegi. 
	
	/*	int t=20;
		while(t<21)
		{
			t=t++;
			System.out.println("Kanchi");
			
		}*/

		int t=20;
		while(t<21)
		{
			
			System.out.println("Kanchi");
			t++;
		}
	}
	
		

}
