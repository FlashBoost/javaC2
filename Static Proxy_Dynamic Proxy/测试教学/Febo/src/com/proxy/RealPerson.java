package com.proxy;

public class RealPerson implements Say{
	@Override
	public void say(String name){
		System.out.println("����һ�������ֽ�"+name);
	}
}
