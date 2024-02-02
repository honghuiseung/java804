package sec01.exam00;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass())return false;
		Student student = (Student)obj;
		return age== student.age && Objects.equals(name, student.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
}
