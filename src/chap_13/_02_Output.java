package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format();
        System.out.println("-----------정수-----------");
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234); // __1234 (6자리의 공간을 확보하고 나서 1234 출력)
        System.out.printf("%06d%n", 1234); // 001234 (6자리의 공간 확보 후 출력 하는데 빈 공간을 0으로 채움)
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234 (항상 기호 표시)
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000
        System.out.printf("%-6%n", 1234); // 1234__ (6자리의 공간 확보 후 왼쪽정렬)

        System.out.println("-----------실수-----------");
        System.out.printf("%f%n", Math.PI); //3.141593
        System.out.printf("%.2f%n", Math.PI); //3.14 (소수점 2번째에서 반올림)
        System.out.printf("%6.2f%n", Math.PI); // __3.14(6자리 확보 후 소수점 2번쨰에서 반올림)
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%06.2f%n", Math.PI); //003.14
        System.out.printf("%+6.2f%n", Math.PI); //_+3.14

        System.out.println("-----------문자열-----------");
        System.out.printf("%s%n", "Java"); //Java
        System.out.printf("%6s%n", "Java"); //__Java
        System.out.printf("%-6s%n", "Java"); //Java__
        System.out.printf("%6.2s%n", "Java"); // ____Ja (6자리 공간 확보하고 앞에 2글자만 출력)
        System.out.printf("%-6.2s%n", "Java"); //Ja____

        System.out.println("-----------응용-----------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("채지수 " + 95 + " " + 100 + " " + 95.0);

        System.out.println("-----------응용2-----------");
        System.out.println("이름      영어   수학   평균"); //공백 6칸 3칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채지수", 95, 100, 95.0);

        System.out.println("-----------참고-----------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");
    }
}
