package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPre {
//main
	public static void main(String[] args) {
		// ���ϵ� String "Ű�� ������ ���� ���� ����"
		// Set.of("" ,"","",)
		TreeSet<String> ���ϵ� = new TreeSet<>(Set.of("Ű��", "������", "����", "����", "����"));
		System.out.println(���ϵ�);

		// ������ ����
		���ϵ�.remove("������");
		System.out.println(���ϵ�);

		// ������ ���ԵǾ� �ִ��� Ȯ��
		System.out.println(���ϵ�.contains("����"));

		// ���ϵ� �� ��� �ִ��� Ȯ��
		System.out.println(���ϵ�.isEmpty());

		// ���ϵ� ����
		System.out.println(���ϵ�.size());

		// ���� ������
		System.out.println("���� ���� ��: " + ���ϵ�.first());

		// ���� ū ��
		System.out.println("����ū�� :" + ���ϵ�.last());

		// ��� �� ����
		���ϵ�.clear();

		// ��� �� ���� �Ǿ� �ִ��� Ȯ��
		System.out.println(���ϵ�.isEmpty());

	}

}