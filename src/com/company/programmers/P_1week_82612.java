package com.company.programmers;

public class P_1week_82612 {

    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;

        for(int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }

        if(money >= totalPrice ) {
            answer = 0;
        }else {
            answer = totalPrice - money;
        }

        return answer;
    }

}
