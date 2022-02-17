package chap4;

public class ArrayCopy {

	public static void main(String[] args) {
		int copyFrom[]={1,2,3,4,5,6,7};
		int []copyTo= {10,20,30,40,50,60,70,80};
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		//copyFrom 의 4번째부터 copyTo에 옮기는데, copyTo[1]부터 시작하고, 총 3개를 옮긴다.
		//즉 copyFrom[4]~copyFrom[6]을 copyTo[1]~copyTo[3]까지 복사함.
		
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]+" ");
			//10 5 6 7 50 60 70 80
		}
	//for each 문. 배열 출력할때편함
		// 배열에서 각각의 원소 값을 순차적으로 처리할대 효과적이나, 순서를 바꾸거나 배열 원소 값을 수정할 수 없다.
		for(int i:copyTo) {
			System.out.print(i+" ");
			//10 5 6 7 50 60 70 80 
		}
		System.out.println();
		//for each 이중배열 구조 출력해보기
		int a[][]= {{1,2,3},{1,2,3}};
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}System.out.println();
			//1 2 3 
			//1 2 3
		}
	}

}
