package chap_04;
//조건문을 활욜하여 주차 요금 정산 프로그램 작성
// 주차요금은 시간당 4000원 (일일최대 요금 30000원)
//경차 또는 장애인 차량은 최종금액에서 50%할인

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; //주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; //장애인 탑승 여부

        int fee = hour * 4000; //시간당 4000원

        //30000원 초과시 일일 최대요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }
        //경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; //50% 할인
        }

        System.out.println("주차 요금은 = " + fee + "원 입니다.");

    }
}
