package question07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s);
		}
		
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.print(name+" ");
		}
		
		int longestIndex=0;
		for (int i = 0; i < a.size(); i++) {
			//a.get(0).length() < a.get(0).length()
			//a.get(0).length() < a.get(1).length()=>참이면 longestIndex=i
			//a.get(0 or 1).length() < a.get(2).length()=>참이면 longestIndex=i
			//a.get(0 or 1 or 2).length() < a.get(3).length()=>참이면 longestIndex=i
			if (a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex=i;
			}
		}
		
		System.out.println("\n가장 긴 이름은 : "+a.get(longestIndex));
		scanner.close();
	}
}

















