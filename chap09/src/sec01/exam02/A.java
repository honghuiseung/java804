package sec01.exam02;

public class A {
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B field3 = new B();
	//하나뿐인 static 변수에 인스턴스 변수를 넣을수 없음
	//여러개 넣을 필요가 없기 때문
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	//인스턴스 멤버 클래스
	class B{}
	
	//정적멤버 클래스
	static class C{}
	
	/*바깥쪽 정적 필드나 메소드는 객체 생성없이 접근가능하지만
	안쪽 정적 필드나 메소드는 정적이어야만 객체 생성이 가능하기 때문*/
	
}
