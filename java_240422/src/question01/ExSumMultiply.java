package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리 정수를 입력(100~999)>>");
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		
//		100자리수: 나누기 100의 몫
		int hundred = n/100;//100자리수
		int hundredRest = n%100;
//		10자리수: 나누기 100의 나머지를 10으로 나눈 몫
		int ten = hundredRest/10;//10자리수
		int one = hundredRest%10;//1자리수
		
		int sum = hundred + ten;
		int multiply = ten * one;
		
		System.out.println("100의 자리와 10의 자리의 합은 "+sum);
		System.out.println("10의 자리와 1의 자리의 곱은 "+multiply);
		
		scanner.close();
	}
}









