package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;

public class PersonController {
	//학생자리 3자리
	private Student[] student = new Student[3];
	
	private int studentIndex = 0;
	
	//사람 수 세기
	public int[] personCount() {
		int[] counts = new int[2]; //counts[0] = 학생수 자리 count
		counts[0] = studentIndex;
		counts[1] = 0;
		return counts;
	}
	//학생의 정보를 입력하면 정보 저장하기
	public void insertStudent(String name, int age, double height, double weight,int grade, String major)	{
		//학생 수 추가하기
		//배열로 쳤을때 index값이 legnth보다 초과되면 넣지 못하게 합시다.
		if(studentIndex < student.length) {
			student[studentIndex++] = new Student(name, age, height, weight,grade, major);
		}else {
			System.out.println("더 이상 학생을 추가할 수 없습니다.");
		}
	}
	//학생 목록 보기
	public Student[] printStudent() {
		return student;
	}

}



