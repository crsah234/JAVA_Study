package chap3;

public class Explicit_type_cast {

	public static void main(String[] args) {
		//명시적 형변환
		//실수를 정수로 변환하거나 범위가 큰 정수형에서 더 작은 정수형으로변환하려면 명시적형변환필요함
		// 데이터 손실 있을 수 있음.
		double a=4.0;
		int n=(int)(3/a);
		
		//자동 형변환
		System.out.println(3/4.0);//3이 자동으로 3.0으로 자동형변환됨.
		
		//산술연산의 주의점
		short data1=32766;
		short data2=1;
		// 오류남. short data3=data1+data2;
		// 그 이유는 자료형 byte와 short의 산술 연산은 모두 int로 변환되어 연산을 수행함. 따라서 명시적 형변환을 해야함.
		
		
	}

}
