package com.company.couplingtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ���� Ŭ����
 * 
 */
public class TvUser {

	public static void main(String[] args) {
		// 1. ������ �����̳� �����Ѵ�.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		//ȯ�漳�� ������ ����ؼ� ��ü�� �����ߴ�.
		
		//2. ������ �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumnUp();
		tv.volumnDown();
				
		//3. ������ �����̳ʸ� �����Ѵ�.
		factory.close();
				
	}
}