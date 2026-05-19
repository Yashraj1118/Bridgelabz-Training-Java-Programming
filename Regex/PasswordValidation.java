package AdvanceJava.Regex;

import java.util.regex.*;

public class PasswordValidation {

    public static void main(String[] args) {

        // Strong Password Regex
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        Pattern pattern = Pattern.compile(regex);

        String[] passwords = {
                "Java@123",     
                "Password1!",   
                "hello123",     
                "JAVA123@",     
                "Pass@1",       
                "Strong@2024"   
        };

        for(String password : passwords){

            Matcher matcher =pattern.matcher(password);

            if(matcher.matches()){
                System.out.println(password + " is Strong Password");
            }
            else{
                System.out.println(password + " is Weak Password");
            }
        }
    }
}