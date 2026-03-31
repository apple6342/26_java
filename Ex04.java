package day05;

public class Ex04 {

	public static void main(String[] args) {
		// 향상된 for문을 활용한 배열 합계 계산
		int[] values = {1, 2, 3, 4, 5};
		int total = 0;
		
		for(int val : values) {
			total += val;
		}
		
		// 결과 출력 (기대값: 15)
		System.out.println(total); 
	}

}