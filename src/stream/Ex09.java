package stream;

import java.util.Arrays;

public class Ex09 {
	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5,6,7,8,9,10};
		
		/*
		 * long count = Arrays.stream(arrInt).filter(n -> n%2 == 0).count();
		 * System.out.println("coutn : " + count);
		 * 
		 * long sum = Arrays.stream(arrInt).filter(n -> n%2 == 0).sum();
		 * System.out.println("sum : " + sum);
		 * 
		 * double average = Arrays.stream(arrInt).filter(n -> n%2 ==
		 * 0).average().getAsDouble(); System.out.println("average : " + average);
		 * 
		 * int min = Arrays.stream(arrInt).filter(n -> n%2 == 0).min().getAsInt();
		 * System.out.println("min : " + min);
		 * 
		 * int max = Arrays.stream(arrInt).filter(n -> n%2 == 0).max().getAsInt();
		 * System.out.println("max : " + max);
		 * 
		 * int first = Arrays.stream(arrInt).filter(n -> n%2 ==
		 * 0).findFirst().getAsInt(); System.out.println("first : " + first);
		 */
		
		// 짝수의 합
		long sum2 = Arrays.stream(arrInt).filter(n -> n%2 == 0).sum();
		System.out.println("sum2 : " + sum2);
		
		// 홀수의 합
		long sum3 = Arrays.stream(arrInt).filter(n -> n%2 != 0).sum();
		System.out.println("sum3 : " + sum3);
	}
}
