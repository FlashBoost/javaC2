package com.jintai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealPerson realPerson=new RealPerson();
		//realPerson.say();
		ProxyPerson proxyPerson=new ProxyPerson(realPerson);
		proxyPerson.say();//��̬����
	}

}
