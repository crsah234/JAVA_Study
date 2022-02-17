package chap4;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue
		int i=1;
		for(i=1;i<=10;i++) {
			if(i%3==0) continue;{ //continue가 실행될시 밑 구문이 아닌 i++로 넘어감
				System.out.println(i+" ");
			}
		}
	}

}
