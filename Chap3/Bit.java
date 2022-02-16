package chap3;

import java.util.Scanner;

public class Bit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		//1과 5를 이용하여 5, 4, 1 250을 출력하라
		// 5 : 0000 0101
		// 4 : 0000 0100
			 // & ^ | ~
		int a=1; // 0000 0001
		int b=5; // 0000 0101
			 //250: 1111 1010 
		int five= a|b; // 둘중 하나라도 1이면 1, 아니면 0
		int four= a^b; // 둘이 달라야 1, 같으면 0
		//long t25= ~b; 이거-6나옴. 250이 아니라.
		System.out.println(five);
		System.out.println(four);
		//System.out.println(t25);
		System.out.println(Long.toBinaryString(250)); // 11111010
		int c=7;
		System.out.println(Integer.toBinaryString(c));
		
		// 0111
		// 0000
		System.out.println("7|0:  "+Integer.toBinaryString(c|0));//X|0=X
		System.out.println("7&-1:  "+Integer.toBinaryString(7&-1));//X&-1=X
		// 0111
		// 1111
			}
}
