package day05; // 패키지 경로 확인 요망

import java.util.Scanner;

public class Ex01 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("고객님의 성함을 입력해주세요: ");
        String customerName = sc.next();
        
        System.out.print("연락처를 입력해주세요: ");
        String phoneNumber = sc.next();

        String welcomeMsg = "Welcome to Shopping Mall";
        String subMsg = "Welcome to Book Market!";

        boolean isExit = false;

        while (!isExit) {
            System.out.println("=========================================");
            System.out.println("\t" + welcomeMsg);
            System.out.println("\t" + subMsg);
            System.out.println("=========================================");
            System.out.println(" 1. 고객 정보 확인 하기\t4. 바구니에 항목 추가하기");
            System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
            System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
            System.out.println(" 7. 영수증 표시하기 \t8. 종료");
            System.out.println("=========================================");
            
            System.out.print("원하시는 메뉴 번호를 선택하세요: ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 8) {
                System.out.println("오류: 1~8 사이의 숫자로 다시 입력해주세요.");
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("현재 등록된 고객 정보: ");
                        System.out.println("이름: " + customerName + ", 연락처: " + phoneNumber);
                        break;
                    case 2: 
                        System.out.println("2. 장바구니 상품 목록 보기:");
                        break;
                    case 3: 
                        System.out.println("3. 장바구니 비우기");
                        break;
                    case 4: 
                        System.out.println("4. 바구니에 항목 추가하기: ");
                        break;
                    case 5: 
                        System.out.println("5. 장바구니의 항목 수량 줄이기");
                        break;
                    case 6: 
                        System.out.println("6. 장바구니의 항목 삭제하기");
                        break;
                    case 7: 
                        System.out.println("7. 영수증 표시하기");
                        break;
                    case 8: 
                        System.out.println("8. 프로그램 종료");
                        isExit = true; 
                        break;
                }
            }
        } // end of while
    }
}