package com.kh.oop.basic;

public class Animal { //동물

	// 1.필드 이름String name 나이 int age
	public String name;
	public int age;
	
	//2.초기 생성자 public Animal () {}
	public Animal() {
		
	}
	
	//3.필수 생성자 String name, int age
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//4.출력메서드 public void info(){System.out.println(이름과 나이 출력)
	public void info() {
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
	}
	
	//5.메인메서드 public static void main~ 
	public static void main(String[] args) {
		
	
	
	// 1) 초기 생성자로 
		Animal dog = new Animal();
		dog.name = "푸름이";
		dog.age = 12;
		
				
		//강아지의 이름 나이
		//강아지 정보 출력
	// 2 ) 필수생성자
		Animal cat = new Animal("고양이", 3);
			//고양이 정보 출력
		
		dog.info();
		cat.info();
	}	
	
	
}
