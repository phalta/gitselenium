package practiceproject;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(5);
		number.add(2);
		number.add(5);
		number.add(10);
		number.add(4, 20);
        number.remove(1);
        number.add(3);
        Collections.sort(number);
		
       System.out.println(number);       // System.out.println("arraylist before" +number);
		number.add(0);
		System.out.println(number);    
	}

}
