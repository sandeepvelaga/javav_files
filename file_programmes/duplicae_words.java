package java_files;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class duplicae_words {

	public static void main(String args[]) throws IOException{

		PrintWriter pw = new PrintWriter("non_dup.txt");
		PrintWriter pw1 = new PrintWriter("duplicate.txt");

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String line=br.readLine();
        
        ArrayList<String> l = new ArrayList<String>();
        
        while(line!=null) {
        	l.add(line);
        	line=br.readLine();
        
        }
        int count=0;
        for(int i=0;i<l.size();i++) {
        	String s=l.get(i);
        	for (int j = 0; j < l.size(); j++) {
                 String s1=l.get(j);
                 
                 if(s.equals(s1))
                 {
                	 count+=1;
                 }
                 else {
					count=0;
				}
                 
				
			}
        	if(count==1) {
        		pw.println(s);
        	}
        	else {
        		pw1.println(s);
        	}
        	count=0;
        	
       
        
        }
        
        pw.close();
        br.close();
    	pw1.close();
	}
	
}

