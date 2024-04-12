package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("홍길순", 20),
				new Student("홍길남", 30),
				new Student("임꺽정", 40),
				new Student("박문수", 50)
				);
		Stream<Student> stdStream = list.stream();
		IntStream scoreStream = stdStream.mapToInt(std -> std.getScore());
		double avg = scoreStream.average().getAsDouble();
		System.out.println("avg :" + avg);
		
		double avg2 = list.stream()
				.mapToInt(std->std.getScore())
				.average()
				.getAsDouble();
		System.out.println("avg2 :" + avg2);
	}

}
