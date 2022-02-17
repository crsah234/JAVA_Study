package chap4;

public class RagidArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파스칼의 삼각형
		// nCr= n!/(r!n-r)!)
		// pascal[n][r]이라고 보면됨.
		// 총 10행.
		int pascal[][] = new int[10][];
		for (int i = 1; i <= 10; i++) {
			pascal[i - 1] = new int[i];
		}
//		for(int i=0;i<10;i++) {래기드배열 됬는지 확인해봄.
//				System.out.println(pascal[i].length);
//		}
		for (int n = 0; n < 10; n++) {
			for (int r = 0; r < pascal[n].length; r++) { // pascal[n][r]정해야함
				System.out.print("n:" + n + " r:" + r);
				System.out.println();
				// 현재 nCr에서 n과 r은 이안에서는 정해져있음.고정값.
				int h = 1;
				int l = 1;
				int n_r = 1;
				// 밑줄은 분모값, 분자값 정해놓기.
				if (n == 0 || r == 0 || n == r)
					pascal[n][r] = 1; // nCr에서 n,r이 둘중하나라도 0이면 값을 1로 넣기.
				else if (r != 0 || n != 0 || n != r) {
					for (int k = n; k >= 1; k--) {// 분모값
						h *= k;
					}
					System.out.println("h: " + h);
					for (int k = r; k > 0; k--) { //분자값 (r!)
						l *= k;
					}
					System.out.println("l: " + l);
					for (int k = n - r; k >= 1; k--) { //분자값 (n-r!)
						n_r *= k;
					}
					System.out.println("n_r: " + n_r);
					pascal[n][r] = h / (l * n_r);
					System.out.println("pascal[][]: " + pascal[n][r]);
				}
			}
		}
		for(int a[]:pascal) {
			for(int b:a)
				System.out.print(b+" ");
			System.out.println();
		}
	}
}
