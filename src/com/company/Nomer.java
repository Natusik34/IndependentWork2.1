package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nomer{
   // public Nomer(String moh111, String uhh9, String llo00) {
   // }

    public static boolean nomer(String string){
       //string = "MOH111 UHH9 LLO00";
       Pattern pattern = Pattern.compile("MOH(\\w*)");
       Matcher matcher = pattern.matcher(string);
       if (matcher.find()){
           System.out.println(matcher.group());
       } else{
           System.out.println("There's no such tring!");
       }
        return false;
    }
}
