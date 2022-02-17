package chap4;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 크기를 변수로 지정하기
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			System.out.println(a[i]);
		}
	}

}
