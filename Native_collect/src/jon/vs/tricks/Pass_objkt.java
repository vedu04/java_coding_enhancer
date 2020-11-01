package jon.vs.tricks;

class Pass_objkt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper p = new Paper();
		p.settext("///Hello World///");
		System.out.println(p.gettext());
		
		Printer hp=new Printer();
		hp.print(p);
		System.out.println(p.gettext());
		
	}

}
