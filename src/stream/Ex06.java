package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("홍길순", 10));
		list.add(new Student("홍길남", 20));
		
		// 오름차순 정렬
		list.stream().sorted().forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		
		// 내림차순 정렬
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
	}
}
