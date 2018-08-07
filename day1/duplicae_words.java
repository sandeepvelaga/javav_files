package java_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class duplicae_words {

	public static void main(String args[]) throws IOException{

		PrintWriter pw = new PrintWriter("dup.txt");


		BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));

		ArrayList<String> lines = new ArrayList<String>(10000);
		String line=reader.readLine();

		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}

	
		pw.close();
		reader.close();


	}
}

