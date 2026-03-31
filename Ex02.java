package day05;

import java.util.Scanner; 

public class Ex02 {

	public static void main(String[] args) {
		// 크기가 5인 1차원 배열 선언 및 생성
		int[] arr = new int[5];
		int maxValue = 0; // 최댓값을 담을 변수 초기화
		
		Scanner scanner = new Scanner(System.in);
		
		// 사용자로부터 양수 5개를 입력받아 배열 요소로 저장, 최댓값 찾기
		System.out.println("다섯 개의 양수를 입력해 주세요.");
		for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scanner.nextInt(); 
            
            // 현재 입력값이 기존 최댓값보다 클 경우 갱신
            if(arr[idx] > maxValue) { 
                maxValue = arr[idx];  
            }
        }
        
        System.out.print("입력된 수 중 가장 큰 값은 " + maxValue + "입니다.");
        
        scanner.close(); // 자원 해제

	}

}