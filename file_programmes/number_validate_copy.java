package java_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class number_validate_copy {
	public static void main(String args[]) throws IOException {


		PrintWriter pw= new PrintWriter("valid_numbers.txt");

		BufferedReader br= new BufferedReader(new FileReader("def.txt"));
		String line=br.readLine();


		while(line!=null) {

			if(validate_number(line)) {
				pw.println(line);
				line=br.readLine();

			}
			else {
				line=br.readLine();
			}
		}
		
		System.out.println("copied");
		pw.close();
		br.close();
	}
	
	private static Pattern usrNamePtrn1 = Pattern.compile("^[8/9][0-9]{9}$");

	public static boolean validate_number(String username) {
		// TODO Auto-generated method stub


		Matcher mtch = usrNamePtrn1.matcher(username);
		if(mtch.matches()){
			return true;
		}else {
		return false;
		}

	}


}




