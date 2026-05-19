package AdvanceJava.Regex;

import java.util.regex.*;

public class EmailValidation {
    public static void main(String[] args) {

        String regex ="^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);

        // Emails to test
        String[] emails = {
                "test@example.com",
                "john123@gmail.com",
                "invalid@",
                "user@domain",
                "@gmail.com"
        };

        for(String email : emails){
            Matcher matcher =pattern.matcher(email);

            if(matcher.matches()){
                System.out.println(email + " is Valid");
            }
            else{
                System.out.println(email + " is Invalid");
            }
        }
    }
}