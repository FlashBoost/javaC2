package com.jintai;

public class ProxyPerson implements Say{
	private RealPerson realPerson;
	public ProxyPerson (RealPerson realPerson){
		this.realPerson=realPerson;
	}
	@Override
	public void say(){
		System.out.println("���");
		realPerson.say();
	}
}
