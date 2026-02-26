package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

public class Helper {


    public  static boolean isNullOrEmpty(String str){
        if(str==null||str.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isValidEmail(String userOrderEmail){
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(userOrderEmail);
    }
//    if(price < 0){
//        return null;
//    }
}
