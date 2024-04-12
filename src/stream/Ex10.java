package stream;

import java.util.ArrayList;
import java.util.List;
/*import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;*/

public class Ex10 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		//System.out.println("avg : " + avg);
		// 계산할 요소가 없으므로 에러 발생 (java.util.NoSuchElementException)
		
		/*
		 * OptionalDouble option1 = list.stream().mapToInt(Integer::intValue).average();
		 * if (option1.isPresent()) { // 값이 있는지 체크! System.out.println("평균 : " +
		 * option1); // 없으니까 if문으로 안들어옴 } else { System.out.println("평균 : 0.0"); // 없으니까
		 * else 문으로 들어옴 }
		 * 
		 * String[] arrStr = {"aa", "bbb", "cccc"}; Stream<String> stream1 =
		 * Stream.of(arrStr); Stream<String> stream2 = Stream.of(arrStr); IntStream
		 * stream3 = stream1.mapToInt(s -> s.length()); IntStream stream4 =
		 * stream2.mapToInt(s -> s.length());
		 * 
		 * stream3.forEach(a -> System.out.println(a));
		 * stream4.forEach(System.out::println); // 메서드 참조 방식으로, 매개변수 등을 생략할 수 있다.
		 */	
		
		
		// orElse 메서드
		double avg2 = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("avg2 : " + avg2);
		
		// ifPresent 메서드
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("avg : " + a));
		// 없으니깐 안나옴.
	
	}

}
