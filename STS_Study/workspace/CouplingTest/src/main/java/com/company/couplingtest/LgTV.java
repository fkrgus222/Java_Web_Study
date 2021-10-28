package com.company.couplingtest;

/*
 * SamsungTV와 LgTV는 메소드 시그니처(signature)가 서로 다르게 구현되어 있다.
 * 
 */
public class LgTV implements TV{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> 전원을 켠다.");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> 전원을 끈다.");
	}

	@Override
	public void volumnUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> 볼륨을 높인다.");
	}

	@Override
	public void volumnDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV  ===> 볼륨을 낮춘다.");
	}

}