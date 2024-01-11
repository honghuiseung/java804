package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1-10;
		}
		// int v3 = v1 + v2 +5;
		// v2의 scope(범위)가 {}안에서 끝나기 떄문에 v2변수를 불러올 수 없음

	}

}
