package java_files;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid_identifier {
	
	private static Pattern usrNamePtrn1 = Pattern.compile("^[^0-9 !@#%&*][a-z 0-9 A-Z _$]{5,15}$");
	
	    public static boolean validateUserName(String userName){
	         
	        Matcher mtch = usrNamePtrn1.matcher(userName);
	        if(mtch.matches()){
	            return true;
	        }
	        return false;
	    }
	     
	    public static void main(String a[]){
	        System.out.println("$san_deep1   is " + validateUserName("$san_deep1"));
	        System.out.println("8sandeep   is " + validateUserName("sandeep08@gmail.com"));
	        System.out.println("sa@ndeep   is " + validateUserName("sa@ndeep"));
	}

}


		