package chap3;

public class Bitshiftoperators {

	public static void main(String[] args) {
		// A>>B : A를B만큼비트 오른쪽으로 이동
		System.out.println(2<<3); //16 : 2*2의 3승
		// A<<B : A를 B만큼 비트 왼쪽으로 이동 //  >> A/(2의B승), << A*(2의B승)이라보면 될듯?
		System.out.println(8>>2); //2 : 8 / 2의 2승  
		// A>>>B: A를 B만큼 오른쪽으로 이동
		// , 단 왼쪽 비트인 부호비트는 모두 0으로 채워짐
		int a=-16>>>3;
		System.out.println(Integer.toBinaryString(-16));
		//11111111111111111111111111110000 
		System.out.println(Integer.toBinaryString(a));
		//00011111111111111111111111111110
		//3칸 오른쪽으로 이동하면서 생긴 왼쪽 공백 모두 0으로 채워
		System.out.println(a); //536870910
		
		// 비트 축약 대입 연산자
		int x=3;
		int y=0xffff_ffff; //모든 비트가 1인 정수
		System.out.printf("%d의 이진수: %s \n",y,Integer.toBinaryString(y));
		System.out.println(x&=y); // X&-1이랑 같 3
		System.out.println(x); // 위와 동일 결과나옴 3
		int key=120;
		System.out.println(x^=key);//한번 암호화 된 값. 다시 키값과 xor하면 원래 값이 나옴
		System.out.println(x^=key); //다시 원래의 값
		
	}

}
