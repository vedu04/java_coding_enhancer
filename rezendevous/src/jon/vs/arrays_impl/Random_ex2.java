package jon.vs.arrays_impl;

import java.util.Random;

class Random_ex2 {
	
	public static void main(String args[]) {
	
		Random reqRandom= new Random();
		int as[]= new int[40];
		
		for(int i=0;i<as.length;i++)
			as[i]=reqRandom.nextInt(40);
		
		try {
			System.out.println("The value is :" +as[49]);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("the last index is 39th");;
		}
		
		
	for(int i:as)
		System.out.println(i);
	
	}

}
