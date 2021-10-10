package com.company.programmers;

public class level2_12924 {
    public int solution(int num) {
        int answer = 0;
        int result = 0;
        for(int i=1; i<=num; i++){
            result = 0;
            for(int j=i; j<=num; j++){
                result += j;
                if(result == num){
                    ++answer;
                }
                else if(result > num){
                    break;
                }
            }
        }
        return answer;

    }
}
