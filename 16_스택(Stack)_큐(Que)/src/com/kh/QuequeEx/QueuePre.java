package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePre {
//main
	public static void main(String[] args) {
	Queue<Integer> 큐우 = new LinkedList<>();	
	
	//offer 80 60 30 20
	큐우.offer(80);
	큐우.offer(60);
	큐우.offer(30);
	큐우.offer(20);
		
	//poll 데이터 확인 및 제거
	int 맨앞데이터 = 큐우.poll();
	큐우.poll();
	System.out.println(맨앞데이터);
	
	//peek 맨 앞 데이터 확인
	int 데이터확인 = 큐우.peek();
	System.out.println(데이터확인);
		
	//isEmpty 비어있는지 확인
	boolean 비어있낭 = 큐우.isEmpty();
	System.out.println(비어있낭);


	
	
	
	
	
	
	
	}

}
