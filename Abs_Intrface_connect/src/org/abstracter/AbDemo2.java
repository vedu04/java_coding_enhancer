//This class does not use the abstract methods.
//Another class next to it uses the abstract concept ..refer to it.
package org.abstracter;

public class AbDemo2 {
	public static void main(String a[])
	{ 
		iph ob=new iph();
		Samsu s7= new Samsu(); 
		show(s7);
	}

	public static void show(Phone p)
	{ p.showConfig();}

}

abstract class Phone
{public abstract void showConfig();	}

class iph extends Phone
{
	public void showConfig() {
		System.out.println("iPhone..........");}
}

class Samsu extends Phone
{
	public void showConfig() 
	{System.out.println("SamsungS7-------");}
}


