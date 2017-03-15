package com.example.alumno1.task2_adrian_menendez_hnd.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static boolean isEmail (String email) {
        String regex =  "^[_a-z0-9-]+(_a-z0-9-)*@[_a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches(); //true si es un email o false si no es un email
    }
}
