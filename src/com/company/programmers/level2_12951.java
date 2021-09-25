package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class level2_12951 {
    public String solution(String s) {
        String answer = "";
        List<String> strArr = new ArrayList<>();
        String text ="";

        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                if(!text.equals("")){
                    strArr.add(text);
                }
                strArr.add(s.substring(i,i+1));
                text ="";
            }else if(i+1 == s.length()){
                text += s.substring(i,i+1);
                strArr.add(text);
            }else{
                text += s.substring(i,i+1);
            }
        }

        for(String str : strArr){
            String first = Character.toString(str.charAt(0));
            answer+= first.toUpperCase()+ str.substring(1).toLowerCase();
        }
        return answer;
    }


}
