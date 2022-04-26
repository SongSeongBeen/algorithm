package com.javaex.algorithm;

public class Solution01 {
        public int solution(int n, int[] stations, int w) {

            int answer = 0;
            int prevRight = 0;
            for (int i = 0; i < stations.length; i++) {
                int curLeft = stations[i] - w;
                int curRight = stations[i] + w;
                int dist = curLeft - prevRight -1;
                if(dist > 0){
                    //기지국 사이에 빈 공간이 있는 경우
                    answer += Math.ceil((double)dist / (2*w+1));
                }
                prevRight = curRight;
            }

            int finalDist = n - prevRight;
            if(finalDist > 0){
                //기지국 사이에 빈 공간이 있는 경우
                answer += Math.ceil((double)finalDist / (2*w+1));
            }

            return answer;
        }

}
