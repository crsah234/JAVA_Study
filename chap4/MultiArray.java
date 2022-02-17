package chap4;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mtrx[][];
		mtrx=new int[2][2];
		mtrx[0][0]=1;
		
		//내가 좋아하는 방식	 선언과 동시에 객체 생성
		int [][]mtarray=new int[2][3] ;
	
		//래기드 배열 만들기. 
		//첫번째 칸에는 1, 둘째칸에는 2.. 이런식.
		int ry[][];
		ry=new int[3][];
		ry[0]=new int[1];// 첫번재인 ry[0]은 1개
		ry[1]=new int[2];// 둘째인 ry[1]은 2개
		ry[2]=new int[3];// 셋째인 ry[2]은 3개
		
	}

}
