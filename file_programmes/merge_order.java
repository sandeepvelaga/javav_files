package java_files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class merge_order {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("merge_order.txt");
		
		BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("def.txt"));
		
		String line1=br1.readLine();
		String line2=br2.readLine();
		
		while(line1!=null) {
			pw.println(line1);
			line1=br1.readLine();
		}
		
		while(line2!=null) {
			pw.println(line2);
			line2=br2.readLine();
		}

		
		pw.flush();
		br1.close();
		br2.close();
		
		System.out.println("files merged orderly");
	}

}
