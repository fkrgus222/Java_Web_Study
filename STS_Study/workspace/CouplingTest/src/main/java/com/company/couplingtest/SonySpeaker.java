package com.company.couplingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker {
	
	//������
	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}
	
	public void volumnUp() {
		System.out.println("SonySpeaker ===> ���� �ø���.");
	}
	
	public void volumnDown() {
		System.out.println("SonySpeaker ===> ���� �����.");
	}
	
	
}