package com.company.programmers;

import java.util.ArrayList;
import java.util.List;

public class level2_12953 {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 1;
        int max = arr[0];

        //max값 구하기
        for(int num : arr){
            if(max < num ){
                max = num;
            }
        }
        while(true){
            boolean result = true;
            answer = max * cnt;
            for(int num : arr){
                if(answer % num != 0){
                    result = false;
                    break;
                }
            }
            if(result){
                break;
            }
            cnt++;
        }
        return answer;
    }
}
