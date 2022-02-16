package chap3;
import java.util.Scanner;
public class Iftest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("f나 F, c C 입력:");
		char c=sc.next().charAt(0);
		System.out.println();
		// charAt(int radix) -> String계열에서 radix 번째에 것을 char로변환한다는 뜻
		System.out.print("온도 입력:");
		double t=sc.nextDouble();
		switch(c) {
		case 'f':
		case 'F': System.out.println("섭씨로 바꾸면:"+(5.0/9.0)*(t-32)); break;
		case 'c':
		case 'C': System.out.println("화씨로 바꾸면:"+(9.0/5.0)*t+32); break;
		default: System.out.println("단위를 잘못입력하셨습니다.");
		
		}
		
	}

}
