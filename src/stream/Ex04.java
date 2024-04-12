package stream;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("홍길동");
		list.add("홍길순");
		list.add("홍길남");
		list.add("박문수");
		list.add("임꺽정");
		list.add("장지현");
		list.add("김구");
		list.add("이산");
		
		// 중복요소 제거
		list.stream().distinct().forEach(n -> System.out.println("이름 : " + n));
		
		System.out.println("\r\n");
		
		// 필터 사용해보기
		list.stream().filter(n -> n.startsWith("홍")).forEach(n -> System.out.println("이름 : " + n)); // 홍으로 시작하는 자
		System.out.println("\r\n");
		list.stream().filter(n -> n.length() < 3).forEach(n -> System.out.println("이름 : " + n)); // 길이가 3보다 작은 자
	}

}
