package my.version.control.system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LCS {

BufferedReader fileReader;
	
	ArrayList<String> l1 = new ArrayList<String>();
	ArrayList<String> l2 = new ArrayList<String>();
	
	public LCS() {
		// TODO Auto-generated constructor stub
		fileReader = null;
	}
	
	public int LCS(String fileName1, String fileName2) {
		// TODO Auto-generated method stub
		try {
			fileReader = new BufferedReader(new FileReader(fileName1));
			String currentLine ;
			while((currentLine = fileReader.readLine())!=null) {	
				// After reading, save the file content somewhere
				l1.add(currentLine);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
			fileReader = new BufferedReader(new FileReader(fileName2));
			String currentLine ;
			while((currentLine = fileReader.readLine())!=null) {
				// After reading, save the file content somewhere
				l2.add(currentLine);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int[][] P_ij = null; 
			
			for(int i = 0; i<l1.size() ; i++){
				for(int j = 0 ; j<l2.size() ; j++){
					P_ij[i][j] = 0;
				}
			}
			
			for(int i = 0; i<l1.size() ; i++){
				for(int j = 0 ; j<l2.size() ; j++){
					if(l1.get(i).contentEquals(l2.get(j))){
						P_ij[i][j] = 1 + P_ij[i-1][j-1];
					}
					else{
						P_ij[i][j] = Math.max(P_ij[i-1][j],P_ij[i][j-1]);
					}
				}
			}
			
			//How to get the LCS from the computed matrix?! 
			
			return 0;
	}

	
	
}
