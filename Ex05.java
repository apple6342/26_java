package day05;

public class Ex05 {

	public static void main(String[] args) {
		// 과일 이름이 담긴 문자열 배열
		String[] fruits = {"사과", "바나나", "딸기", "복숭아", "포도"};
		
		try {
			// 고의로 배열 크기를 벗어나는 인덱스까지 반복 (길이는 5지만 6번 반복)
			for(int k = 0; k < 6; k++) {
				System.out.println(fruits[k]);
			}
		} catch(ArrayIndexOutOfBoundsException ex) {
			// 예외 발생 시 에러 메세지 출력
			ex.printStackTrace();
		}
	}

}