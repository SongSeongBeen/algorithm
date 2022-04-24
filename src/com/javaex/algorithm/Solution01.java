package com.javaex.algorithm;

public class Solution01 {
	public int solution(int n, int[] stations, int w){
		
	    int answer = 0;
	    int index = 0;
	    int dong = 1;
	
	    while(dong <= n){
	        if(index < stations.length && dong >= stations[index] - w ){
	            dong = stations[index] + w + 1;
	            index ++;
	        }
	        else {
	            answer += 1;
	            dong += (w*2) +1;
	
	        }
	    }
	    System.out.println(answer);
	    return answer;
	   
	}
	
}
