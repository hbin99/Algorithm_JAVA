package com.company.programmers;

public class level2_12939 {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(String temp : arr){
            if(max < Integer.parseInt(temp)){
                max = Integer.parseInt(temp);
            }
            if(min > Integer.parseInt(temp)){
                min = Integer.parseInt(temp);
            }
        }
        answer = Integer.toString(min) + " "+Integer.toString(max);
        return answer;
    }

}
