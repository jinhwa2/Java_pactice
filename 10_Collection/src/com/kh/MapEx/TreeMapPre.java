package com.kh.MapEx;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapPre {
	public static void main(String[] args) {
	TreeMap<String,String> tmp = new TreeMap<>();
	
	String[] keys = {"apple","banana","orange","grape","watermelon"};
	String[] values = {"���","�ٳ���","������","����","����"};
	
	for(int i=0; i<keys.length; i++) {
		tmp.put(keys[i], values[i]);
	}
		System.out.println(tmp);
	
		System.out.println(tmp.get("banana"));
		System.out.println(tmp.size());
		System.out.println(tmp.isEmpty());
		System.out.println(tmp.containsKey("grape"));
		System.out.println(tmp.containsValue("����"));
		System.out.println(tmp.keySet());
		System.out.println(tmp.values());
		System.out.println(tmp.firstKey());
		System.out.println(tmp.lastKey());
		tmp.clear();
		System.out.println(tmp);
	
	}
}