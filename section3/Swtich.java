package chap3;

import java.util.Scanner;

public class Swtich {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// switch는 문자와 문자열을 지원함.
		char op = '+';
		double x = 3.45, y = 9.83;
		switch (op) {
		case '+':
			System.out.println(x + "+" + y + "=" + (x + y));
			break;
		case '-':
			System.out.println("응 아냐");
			break;

		}
	}
}
