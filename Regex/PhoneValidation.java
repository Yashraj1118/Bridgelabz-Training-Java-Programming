
package AdvanceJava.Regex;

import java.util.regex.*;

public class PhoneValidation {

    public static void main(String[] args) {
        String regex ="^\\+?[0-9]{1,3}?[-. ]?[0-9]{10}$";
        Pattern pattern =Pattern.compile(regex);

        String[] numbers = {
                "+91 9876543210",
                "+1-9876543210",
                "919876543210",
                "9876543210",
                "+44.9876543210",
                "12345",
                "98abc76543"
        };

        for(String phone : numbers){
            Matcher matcher =pattern.matcher(phone);
            if(matcher.matches()){
                System.out.println(phone + " Valid");
            }
            else{
                System.out.println(phone + " Invalid");
            }
        }
    }
}