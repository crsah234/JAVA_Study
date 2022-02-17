package chap4;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언시 절대로 배열크기를 표시할 수 없다.
		//배열은 실제 배열 객체를 가리키는 참조형이다.
	//배열 선언
		int month[];
		double values[];
		int []a,b;//a b둘다 배열로 선언됨.
		int c[][];
	//배열 객체의 생성(선언한 것의 객체를 생성함,배열 크기랑 같이)
		month=new int[5]; //크기가 5인 배열
		values=new double[6];// 크기가 6인 배열
		c=new int[5][6];//이중 배열
		
	//배열 객체의 선언과 생성을 동시에.
		float fl[]=new float[5];
	//배열 원소 참조 -> 배열 이름[첨자]를 사용함.
		double date[]=new double[3];
		date[0]=1;
		date[1]=2;
		date[2]=3;
		//date[3]=4; 오류남. 범위초과로 인해.
		
	//배열 초기화 -> 대입연산자 사용
		double dScore[]= {1.23,1.44,2.32};
		//배열 크기 선언불가.
		//double d[3]= {1,2,3}; [3]에서 오류남.
		
	//배열 선언 이후의 초기화, 다른 배열의 대입
		//배열의 초기화는 일반적으로 배열 선언과 함께 바로 초기화가 됨.
		// 따라서 배열 선언 이후 배열 이름으로 초기 값을 저장하면 오류 발생
		int score[];
		//score= {2,4,5}; Array constants can only be used in initializers
		//올바른 방법은 객체 생성과 저장을 해주는 것.
		score=new int[] {2,4,7};
		
		// 배열 생성 방법 3가지
			//1. 배열 선언 후 객체 생성(배열 크기도)및 저장. 그 후 배열 원소참조(3단계)(1,2,3)
		int array1[]; //1
		array1=new int[2]; // 2
		array1[0]=1; //3
		array1[1]=2;
			//2. 배열 선언 및 객체 생성(배열크기도) 및 저장을 동시에. 그 후 배열 원소 참조. (1-2), 3
		int array2[]=new int[2];//1
		array2[0]=1;//2
		array2[1]=2;
			//3. 배열 선언 및 객체 생성, 배열 원소참조를 동시에, 단 이때 배열 크기 표시는 하지 못한다. (1-2-3)
		int array3[]=new int[] {1,2,3,4};
		
			//4. 배열 선언 후, 객체 새로 생성 과 동시에 참조 값 넣기.(1,2-3)
		int array4[];
		array4=new int[] {1,2}; //배열크기 안됨.
		//배열 크기를 못쓰는경우는 참조값을한번에 넣을 때이다.(3번 4번)
		
		
	}

}
