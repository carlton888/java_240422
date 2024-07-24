package question01;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scanner=new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;

		default:
			System.out.println("잘못입력");
			break;
		}
		/*
		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		}else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		}else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못입력");
		}
		*/
		
		scanner.close();
	}
}
