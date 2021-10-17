package com.company.programmers;

import java.util.Arrays;

public class level2_12913 {
    public int solution(int[] A, int[] B) {
        //오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i=0; i<A.length; i++) {
            sum += A[i] * B[A.length-i-1];
        }

        return sum;
    }
}
