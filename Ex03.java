package day05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 길이가 5인 배열 준비
		int[] dataArr = new int[5];
		
		int totalSum = 0; // 누적 합계용 변수
		
		Scanner inputReader = new Scanner(System.in);
		
		System.out.println("양수 5개를 차례대로 입력바랍니다.");
		for(int j = 0; j < dataArr.length; j++) {
			dataArr[j] = inputReader.nextInt(); // 입력값 배열 할당
			totalSum += dataArr[j];             // 합계 누적
		}
		
		// 평균 구하기 (정확한 연산을 위해 double 캐스팅 적용)
		double avgResult = (double) totalSum / dataArr.length; 
        
		System.out.println("입력하신 숫자들의 총합은 " + totalSum + "입니다.");
		System.out.println("입력하신 숫자들의 평균값은 " + avgResult + "입니다.");
        
		inputReader.close();
	}

}