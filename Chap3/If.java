package chap3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 입력:");
		int point = sc.nextInt();
		sc.nextLine();

		char grade;
		char plus='.';
		if (90 <= point) {
			grade = 'A';
			if(95<=point)
				plus='+';
		}
		else if (80 <= point)
			grade = 'B';
		else grade='C';
		System.out.println(grade+""+plus);
	}

}
