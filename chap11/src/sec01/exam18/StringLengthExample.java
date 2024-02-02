package sec01.exam18;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "9808251189123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호의 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호의 자리수가 틀립니다.");
		}

	}

}
