package chap_10;
//스트림을 이용하여 미술관 방문 손님에게 적절한 입장료를 안내하는 프로그램 자것ㅇ
//손님 이름 및 나이 정보를 위한 Customer 클래스 생성
//입장료는 1인당 5000원 고정
//20세 이상의 손님들에게만 입장료 부과(그외는 무료)

import java.util.ArrayList;

public class _Quiz_10 {
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러", 50));
        list.add(new Customer("레이철", 42));
        list.add(new Customer("모니카", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("-----------------------");
        list.stream().map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
                .forEach(System.out::println);
    }
}

class Customer{
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
