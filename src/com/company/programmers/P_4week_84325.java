package com.company.programmers;

public class P_4week_84325 {

    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int max = 0;
        int score = 0;

        for(int i = 0; i< 5; i++){
            String[] sum = table[i].split(" ");
            score = 0;
            for(int j = 0; j< languages.length; j++){
                for(int k = 1; k<6; k++){
                    if(languages[j].equals(sum[k])){
                        score += ((6-k)*preference[j]);

                    }
                }
            }

            if(max < score){
                max = score;
                answer = sum[0];
            }else if(max == score){
                System.out.println(answer.charAt(0));
                //이름이 빠른순 SI PORTAL
                if(answer.charAt(0)>sum[0].charAt(0)){
                    max = score;
                    answer = sum[0];
                }
            }
        }
        return answer;
    }


}
