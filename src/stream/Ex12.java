package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12 {

	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2("홍길동", 95, "남"));
		list.add(new Student2("홍길순", 65, "여"));
		list.add(new Student2("홍길남", 25, "남"));
		list.add(new Student2("박문수", 75, "남"));
		list.add(new Student2("임꺽정", 85, "여"));
		
		// toList() 메서드 사용
		List<Student2> mList = list.stream().filter(s -> s.getGender().equals("남")).toList();
		mList.stream().forEach(a -> System.out.println(a.getName()));
		List<Student2> fList = list.stream().filter(s -> s.getGender().equals("여")).toList();
		fList.stream().forEach(a -> System.out.println(a.getName()));
		
		// collect(Collectors.toMap()) 사용
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		System.out.println("map : " + map);
	}

}
