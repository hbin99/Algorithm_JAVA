package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class kakao_81301 {
    public static void main(String[] args) {
        int result =0;
        result = solution("one4seveneight");
        System.out.println(result);
    }
    public static int solution(String s) {
        int answer = 0;
        s ="one4seveneight";
        String[] stArr = {"zero","one","two","three","four","five","six","seven","eight","nine",
                "0","1","2","3","4","5","6","7","8","9"};
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        for(int i =0; i<stArr.length; i++){
            list.add(stArr[i]);
        }
        boolean sflag = true;
        int first =0;
        int last = 1;
        String temp ="";
        while(sflag){
            String n = s.substring(first,last);
            if(list.contains(n)){
                switch(n){
                    case "zero":
                        temp = "0";
                        break;
                    case "one":
                        temp = "1";
                        break;
                    case "two":
                        temp = "2";
                        break;
                    case "three":
                        temp = "3";
                        break;
                    case "four":
                        temp = "4";
                        break;
                    case "five":
                        temp = "5";
                        break;
                    case "six":
                        temp = "6";
                        break;
                    case "seven":
                        temp = "7";
                        break;
                    case "eight":
                        temp = "8";
                        break;
                    case "nine":
                        temp = "9";
                        break;
                    default :
                        temp = n;
                }
                list2.add(temp);
                first = last;
                last++;
            }else{
                last++;
            }
            if(s.length() < last){
                break;
            }
        }

        String result ="";
        for(int i =0; i< list2.size(); i++){
            result += list2.get(i);
        }

        answer = Integer.parseInt(result);
        return answer;
    }

}
