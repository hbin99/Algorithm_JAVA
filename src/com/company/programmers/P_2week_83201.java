package com.company.programmers;

public class P_2week_83201 {

    public String solution(int[][] scores) {
        String answer = "";

        for (int i = 0; i < scores.length; i++) {
            int min = 100;
            int max = 0;
            int sum = 0;
            int av = 0;
            int count = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if (min > scores[j][i])
                    min = scores[j][i];
                if (max < scores[j][i])
                    max = scores[j][i];
                if(scores[j][i] == scores[i][i])
                    count++;
                sum += scores[j][i];
            }
            if ((min == scores[i][i] || max == scores[i][i]) && count == 1) {
                sum -= scores[i][i];
                av = sum / (scores[i].length - 1);
            } else {
                av = sum / scores[i].length;
            }
            if (av >= 90)
                answer += "A";
            else if (av >= 80)
                answer += "B";
            else if (av >= 70)
                answer += "C";
            else if (av >= 50)
                answer += "D";
            else
                answer += "F";

        }
        return answer;
    }


}
