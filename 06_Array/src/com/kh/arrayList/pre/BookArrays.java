package com.kh.arrayList.pre;

import java.util.Arrays;

public class BookArrays {
	public static void main(String[] args) {
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드", "손원평");
		책들[1] = new Book("불변의법칙", "모건 하우철");
		책들[2] = new Book("나는 읽고 쓰고 버린다", "손웅정");
	//책 정보 복사
		//								복사하고싶은변수명, 어디까지복사할것인지 숫자입력
		Book[] 무지개도서관 = Arrays.copyOf(책들, 책들.length);
		//무지개 도서관 정보 출력
		System.out.println("=== 무지개 도서관 책정보 ===");
		//for - each
		for(Book 책 : 책들) {
			System.out.println(책.getBookName()+" , "+책.getAuthor());
		}
		//책들과 무지개 도서관 책이 같은지
		boolean same = Arrays.equals(책들, 무지개도서관);
		//무지개도서관 주황도서관 책을 복사해서 가지고 오는데
		Book[] 주황도서관 = Arrays.copyOf(책들, 3);
		//for - each 문 출력 주황도서관에서 가진 책정보 출력
		for(Book 책 : 책들) {
			System.out.println(책.getBookName()+","+책.getAuthor());
		}
	}

}
