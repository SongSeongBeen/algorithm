package com.javaex.algorithm;

import java.util.Scanner;

public class MaxMin {
	 public static void main(String args[]){
	        Scanner input = new Scanner(System.in);
	        int size = input.nextInt(); //주어질 정수의 개수
	        int num;
	        int min = input.nextInt(); //최초 입력 숫자를 최소값이라 가정한다
	        int max = min; // 최초 입력 숫자를 최대값이라 가정한다
	        for (int i=1; i<size; i++){
	            num = input.nextInt(); //두번째 이후 입력 숫자를 저장한다
	            if(max < num) //두번째 이후 입력 숫자가 내가 처음 가정한 최대값보다 큰지 확인하여 더 크면 최대값을 바꿔준다
	                max = num;
	            else if(min > num) //두번째 이후 입력 숫자가 내가 처음 가정한 최소값보다 작은지 확인하여 더 작으면 최소값을 바꿔준다
	                min = num;
	        }
	        System.out.printf("%d %d", min, max);
	    }

}
