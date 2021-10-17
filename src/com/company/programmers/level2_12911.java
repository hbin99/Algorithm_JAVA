package com.company.programmers;

import java.util.Arrays;

public class level2_12913 {
    int solution(int[][] land) {
        int answer = 0;
        int loc = 0;
        int preLoc =0;
        for(int i =0; i<land.length; i++){
            int max = land[i][0];
            for(int j = 0 ; j<land[i].length; j++){
                //최고값과 그의 위치 (처음)
                if(max < land[i][j] && preLoc == 0 ){
                    max = land[i][j];
                    loc = j+1;

                }else if(max < land[i][j] && preLoc != (j+1) ){
                    max = land[i][j];
                    loc = j+1;
                }else{
                    loc =1;
                }
            }
            preLoc=loc;
            System.out.println(max+ "    " + loc);
            answer += max;
        }
        return answer;
    }
    int solution1(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            land[i][0] = land[i][0] + Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]); //123
            land[i][1] = land[i][1] + Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]); //023
            land[i][2] = land[i][2] + Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]); //013
            land[i][3] = land[i][3] + Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]); //012
        }

        return Arrays.stream(land[land.length-1]).max().getAsInt();
    }
}
