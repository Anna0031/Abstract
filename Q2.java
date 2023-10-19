package Abstract;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Q2 {

	public static void main(String[] args) {
		
		
		
		
		List<String>  pp = new ArrayList<String>();	
		pp.add("mayuri,26\n");
		pp.add("anagha,25\n");
		pp.add("jaya,24\n");
		pp.add("sakshi,20\n");
		pp.add("srushti,21\n");
		
		
	Collections.sort(pp);
//		Iterator itr = pp.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(String y:pp) {
			System.out.println("the list is \n:"+y);
		}
		}

	

}
