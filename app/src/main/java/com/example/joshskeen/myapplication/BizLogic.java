package com.example.joshskeen.myapplication;

/**
 * Created by waqas on 9/30/2015.
 */


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BizLogic {

    public int integer = 1;

    public int doubleInteger() {    return integer * 2; }

    public String justaString(){    return "foo";   }

    public String matchDate(String string) {
        Pattern pattern = Pattern.compile("\\b(\\d{2}-\\d{2}-\\d{4})");
        Matcher matcher = pattern.matcher(string);
        String date = "";
        while (matcher.find()) {
            date = matcher.group(0);
        }
        return date;
    }
}
