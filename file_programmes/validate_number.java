package java_files;


import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate_number {

	private static Pattern usrNamePtrn1 = Pattern.compile("^[8/9][0-9]{9}$");

    public static boolean validateUserName(String userName) throws IOException{
         
    	
    	
    	
        Matcher mtch = usrNamePtrn1.matcher(userName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]) throws IOException{
        System.out.println("A215487958  is " + validateUserName("A215487958"));
        System.out.println("984894647   is " + validateUserName("9848946467"));
        System.out.println("5008755765  is " + validateUserName("5008755765"));
       /* 
        BufferedReader br= new BufferedReader(new FileReader("validate_number.java"));
    	PrintWriter pw=new PrintWriter("reg_and_file.txt");
    	
    	String line=br.readLine();
    	
    	while(line!=null && validateUserName(line)) {
    		pw.println(line);
    		line=br.readLine();
    	}
    	
    	br.close();
    	pw.close();*/
        
    }
}

