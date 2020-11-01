package jon.vs.collection.impl;

import java.util.ArrayList;
import java.util.Collection;

public class generaliz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> st=new ArrayList<>();
		st.add("");
		st.add("Tic");
		st.add("Tac");
		st.add("toe");
		st.add("Carrom");
		st.add("Board");
		st.add("Bat");
		st.add("and");
		st.add("Ball");
		st.add("Snake");
		st.add("Ladder");
		
		for(String s:st)
		{System.out.println(s);}
	}

}
