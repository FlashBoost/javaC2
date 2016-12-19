package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyPerson implements InvocationHandler{
//	private Object obj=new String("jhassdhbdsh");//上转型string 转 object
//	String a=(String) obj;//下转型
	private Object obj;
	public ProxyPerson(Object obj){
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("你好");
		Object o=method.invoke(obj, args);	//实现realPerson里的say方法	
		return o;
	}
	
}
