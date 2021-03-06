package com.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBUBeans {
	
	@Value("${sbu.id}")
	private int sbuId;
	@Value("${sbu.name}")
	private String sbuName;
	@Value("${sbu.head}")
	private String sbuHead;
	
	public int getSbuId() {
		return sbuId;
	}
	
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	
	public String getSbuName() {
		return sbuName;
	}
	
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	
	public String getSbuHead() {
		return sbuHead;
	}
	
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	

}