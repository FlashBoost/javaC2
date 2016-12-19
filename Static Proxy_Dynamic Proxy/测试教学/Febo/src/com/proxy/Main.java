package com.proxy;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {

		RealPerson realPerson=new RealPerson();

		ProxyPerson proxyPerson=new ProxyPerson(realPerson);
		//Say SongTianJian=Proxy.newProxyInstance(loader, interfaces, h)
		Say SongTianJian=(Say) Proxy.newProxyInstance(realPerson.getClass().getClassLoader(),realPerson.getClass().getInterfaces(), proxyPerson);//获得代理
		SongTianJian.say("宋天健");						
	}
}