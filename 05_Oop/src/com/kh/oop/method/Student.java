package com.kh.oop.method;

public class Student {
	//필드
	//학생 이름 나이 학년
	private String name;
	private int age;
	private int grade;
	
	//메서드
		//생성자 : 기본
	public Student() {
		
	}
	
		//생성자 : 필수 이름 나이 학년
	public Student(String name,int age,int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
		//return 메서드
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		
		public int getgrade() {
			return grade;
		}
	
		//츨력
		public void info() {
			System.out.println("학생의 이름:"+name);
			System.out.println("학생의 나이:"+age);
			System.out.println("학생의 학년:"+grade);
		}
	
	//메인메서드
	public static void main(String[] args) {
		Student student1 = new Student("박영수",15,2);
		Student student2 = new Student("김영희",17,1);
		student1.info();
		student2.info();
		//student1 "박영수" 15세 2학년
		//student2 "김영희" 17 1
			

	}

}
