package java_files;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc@gmail.com  is " + validate_email_Name("abc@gmail.com"));
        System.out.println("aaa@gmail.com   is " + validate_email_Name("aaa@gmail.com"));
        System.out.println("abc@gmaillll  is " + validate_email_Name("abc@gmaillll"));

	}

	private static Pattern usrNamePtrn1 = Pattern.compile("^[^A-Z0-9][_A-Za-z0-9-]+(\\.[_A-Za-z]+)*@[A-Za-z]+(\\.[A-Za-z0-9])*(\\.[A-Za-z]{2,})$");
	
	private static boolean validate_email_Name(String username) {
		// TODO Auto-generated method stub
		

        Matcher mtch = usrNamePtrn1.matcher(username);
        if(mtch.matches()){
            return true;
        }
		return false;
		

	}

}

