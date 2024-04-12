package stream;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5};
		
		int total = Arrays.stream(arrInt).filter(a -> a % 2 == 0).peek(n -> System.out.println("짝수 : " + n)).sum();
		System.out.println("total : " + total);
		
		Arrays.stream(arrInt).filter(a -> a % 2 == 0).forEach(n -> System.out.println("짝수 : " + n));
	}

}
