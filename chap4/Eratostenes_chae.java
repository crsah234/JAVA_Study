package chap4;

public class Eratostenes_chae {

	public static void main(String[] args) {
		int prime[] = new int[1001];
		for (int i = 0; i < 1001; i++) { 
			prime[i] = 0; //일단 prime[]에 모든 값0으로 넣고.
		}
		for (int i = 2; i < 1001; i++) {
			prime[i] = 1; //prime[2]부터 모든 값 1로 변경
		}
		for (int n = 2; n < 1001; n++) { // 배수 정하는 값 2의배수냐, 3의배수냐..등등
//			System.out.println("n: " + n);
			if (prime[n] == 0) // 밑에서 어떤수의 두번째배수부터는 배열값을 0으로 바꿨으니 0인값은 미리 제외. 
				continue;
			for (int i = n; i < 1001; i++) { // 배열의 지우기
				if (i % n == 0) { // 만약 n으로 i가 나눠진다면 실행(배수일경우)
					if (i == n) //근데 첫번째 배수는 제외해야하므로.
						prime[i] = 1; 
					else //두번째배수부터는 0으로 변경.
						prime[i] = 0;
				}
			}
		}
		int n = 0; //출력 20개마다 새로운줄 출력하기 위한 것.
		for (int i = 0; i < 1001; i++) {
			if (prime[i] == 1) { // 0으로 초기화 안된 것들. 즉 소수들만출력하기
				System.out.printf("%4d", i);
				n++;
				if (n % 20 == 0)
					System.out.println();
			}
		}
	}

}
