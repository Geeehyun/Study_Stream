package stream;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("홍길순", 10));
		list.add(new Student("홍길남", 20));
		// 사용자 클래스에서 Comparable 인터페이스 구현없이 정렬 할 때 비교하는 방법
		list.stream()
			.sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));
		// 내림차순 만들기
		list.stream()
			.sorted((s2, s1) -> Integer.compare(s1.getScore(), s2.getScore()))
			.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));
	}

}
