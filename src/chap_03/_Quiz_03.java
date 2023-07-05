package chap_03;
//주민번호에서 생년월일 및 성별 까지만 출력하는 프로그램 작성
//주민번호 13자리 구성
//앞 6자리는 생년월일 정보, 뒷 7자리는 성별 정보
//입력 데이터는 -을 포함한 14자리의 문자열 형태
public class _Quiz_03 {
    public static void main(String[] args) {
        String s1 = "960325-1111111";
        String s2 = "970719-2222222";
        System.out.println(s1.substring(0, 8)); //0위치부터 8위치 직전까지
        System.out.println(s2.substring(0, 8)); //0위치부터 8위치 직전까지
        System.out.println(s1.substring(0, s1.indexOf("-") + 2));

    }
}
