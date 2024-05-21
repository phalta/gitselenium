package practiceproject;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <String> ar= new ArrayList<String>();
	ar.add("priya");
	ar.add("nik");
	ar.add("pilu");
	ar.add("baba");
	System.out.println(ar);
	Iterator <String> it = ar.iterator();
	System.out.println(it.next());
	}

}
