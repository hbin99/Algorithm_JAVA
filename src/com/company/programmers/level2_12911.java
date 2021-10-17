package com.company.programmers;

import java.util.Arrays;

public class level2_12911 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int num = n;

            // n을 2진수 만들고 1의 개수 확인
            int count1 = 0;
            while(num != 0) {
                if(num % 2 == 1) count1++;
                num /= 2;
            }

            // n에서 1씩 증가하면서 1의 개수 확인하기
            int count2 = 0;
            while(true) {
                num = ++n;
                count2 = 0;
                while(num != 0) {
                    if(num % 2 == 1) count2++;
                    num /= 2;
                }

                if(count1 == count2) {
                    answer = n;
                    break;
                }
            }

            return answer;
        }
    }
}
