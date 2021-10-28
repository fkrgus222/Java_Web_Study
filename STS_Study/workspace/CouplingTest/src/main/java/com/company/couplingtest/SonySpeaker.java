package com.company.couplingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker {
	
	//积己磊
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 按眉 积己");
	}
	
	public void volumnUp() {
		System.out.println("SonySpeaker ===> 杭俘 棵赴促.");
	}
	
	public void volumnDown() {
		System.out.println("SonySpeaker ===> 杭俘 撤冕促.");
	}
	
	
}