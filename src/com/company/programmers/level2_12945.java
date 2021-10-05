package com.company.programmers;

import java.util.*;
public class level2_12945 {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list= new ArrayList<Integer>();
        for(int i =0; i<=n; i++){
            if(i == 0 || i ==1){
                list.add(i);
            }else if(i>=2){

                int sum = list.get(i-1) + list.get(i-2);
                list.add(sum % 1234567);
            }
        }
        answer = list.get(n);
        return answer;
    }
}
