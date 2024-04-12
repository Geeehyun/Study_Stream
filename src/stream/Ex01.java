package stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {
		Set<String> std = new HashSet<String>();
		std.add("홍길동");
		std.add("임꺽정");
		std.add("신길동");
		std.add("신자바");
		std.add("신기루");
		
		Stream<String> str = std.stream(); // 만든 Set 객체를 Stream 객체로 전환
		str.forEach(n->System.out.println(n)); // Stream 객체를 forEach 메서드롤 통해 각 요소마다 처리해줌
		
	}

}
