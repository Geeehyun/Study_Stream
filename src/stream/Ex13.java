package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex13 {

	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2("홍길동", 92, "남"));
		list.add(new Student2("홍길순", 82, "여"));
		list.add(new Student2("홍길남", 72, "남"));
		list.add(new Student2("오혜영", 93, "여"));
		
		// 성별 기준으로 그룹핑 하여 Map 객체에 넣음
		Map<String, List<Student2>> map = list.stream().collect(Collectors.groupingBy(s->s.getGender()));
		
		// 각 각의 성별(키값)을 이용해서 list로 분리
		List<Student2> mList = map.get("남");
		List<Student2> fList = map.get("여");
		
		mList.stream().forEach(s->System.out.println(s.getName()));
		System.out.println();
		fList.stream().forEach(s->System.out.println(s.getName()));
		
		// 각 성별로 그룹핑 후 평균점수 계산
		Map<String, Double> map1 = list.stream().collect(Collectors.groupingBy(s-> s.getGender(), Collectors.averagingDouble(s->s.getScore())));
		System.out.println(map1);
	}

}
