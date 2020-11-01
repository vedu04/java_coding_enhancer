package jon.vs.arrays_impl;

public class declare_a {
			public static void main(String args[]) {
				
			int s[];
			s=new int[7];
			s[0]= 21;
			s[1]=22;
			s[2]=23;
			s[3]=24;
			s[4]=25;
	     //	System.out.println(s);  		//this line prints the hashcode( coz, arays in java are objects and when objects r tried to be printed,they'll print the hashcode.
			
			for(int i=0;i<7;i++)
			System.out.println("value in array s["+i+"]:"+s[i]);
			System.out.println("  ");
			
			for(int i=0;i<7;i++)
				System.out.printf("value in array s[%d] is %d \n",i, s[i]);
			
			}
}
