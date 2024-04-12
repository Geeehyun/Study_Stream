package stream;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 92),
				new Student("홍길순", 85),
				new Student("홍길남", 88)
				);
		
		int sum1 = list.stream().mapToInt(Student::getScore).sum();
		System.out.println("sum1 : " + sum1);
		
		int sum2 = list.stream().mapToInt(Student::getScore).reduce(0, (a,b) -> a+b);
		System.out.println("sum2 : " + sum2);
		
	}
}
