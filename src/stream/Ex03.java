package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static int sum = 0;

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		for(int i = 1; i <= 5; i++) {
			Product product = new Product(i, "상품 "+i, "우리회사", (int) (10000 * Math.random()));
			list.add(product);
		}
		
		Stream<Product> str = list.stream();
		str.forEach(p->System.out.println(p));
		
		list.stream().forEach(p->System.out.println(p)); // 위와 동일한 방법이나 한줄로 작성한 것
		
		System.out.println("\r\n");
		// 배열활용해보기
		String[] arrStr = {"홍길동", "홍길순", "홍길남", "박문수", "임꺽정"};
		Stream<String> strStream = Arrays.stream(arrStr);
		strStream.forEach(s->System.out.println(s));
		
		System.out.println("\r\n");
		// IntStream 써보기
		IntStream stream = IntStream.rangeClosed(1,100);
		stream.forEach(i -> sum+=i);
		System.out.println("합계 : " + sum);
	}

}
