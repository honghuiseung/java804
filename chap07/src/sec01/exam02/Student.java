package sec01.exam02;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //순서는  super가 가장먼저, 항상 파라미터가 있어야함
		this.studentNo = studentNo;
	}
}
