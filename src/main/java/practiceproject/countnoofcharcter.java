package practiceproject;

import java.util.Scanner;

public class countnoofcharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String s="priyanik";
	System.out.println("enter string");
	Scanner sc= new Scanner(System.in);
	String s = sc.nextLine();
	
	int before = s.length();
	int after = s.replace("i", "").length();
	int count= before - after;
	System.out.println("total no of lenth "  +count);
	
	}

}
