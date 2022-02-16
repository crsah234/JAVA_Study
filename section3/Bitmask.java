package chap3;

public class Bitmask {

	public static void main(String[] args) {
		int x = 287956;
		int num = 4;
		int mask = 1 << num - 1; // 마스크의 4번째 비트를 1로 만들어, 알고자하는 x의 4번째 비트와 계산시킬것
		System.out.printf("%d번째 x의 비트는 %d입니다.", num, x & mask);
		System.out.println(((x & mask) == 0 ? 0 : 1));// 둘다 1이어야 1이나오고,그 비트가 0이면 0이나옴.
	}

}
