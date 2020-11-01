package jon.vs.arrays_impl;

import java.util.Random;

class Random_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
	int a[]=new int[30];
	
	
	for(int i=0; i<a.length;i++)
		a[i]=r.nextInt(50);
	
	for(int i:a)
		System.out.println(i);
	}

}
