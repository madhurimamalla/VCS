package my.version.control.system;

import java.util.Scanner;

public class VersionControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName1 ;
		String fileName2 ;		
		
		Scanner s1 = new Scanner(System.in);		
		System.out.println("Enter the first filename:");
		fileName1 = s1.nextLine();
		System.out.println("You've entered:" + fileName1);
		
		System.out.println("Enter the second filename:");
		fileName2 = s1.nextLine();
		System.out.println("You've entered: "+fileName2);
		
		int length;
		
		LCS lcs1 = new LCS();
		length = lcs1.LCS(fileName1,fileName2);
		
	}

}
