package com.company.couplingtest;

/*
 * SamsungTV�� LgTV�� �޼ҵ� �ñ״�ó(signature)�� ���� �ٸ��� �����Ǿ� �ִ�.
 * 
 */
public class LgTV implements TV{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> ������ �Ҵ�.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> ������ ����.");
	}

	@Override
	public void volumnUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> ������ ���δ�.");
	}

	@Override
	public void volumnDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> ������ �����.");
	}

}