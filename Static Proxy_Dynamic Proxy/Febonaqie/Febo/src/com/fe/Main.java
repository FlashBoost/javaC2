package com.fe;

import java.lang.reflect.Proxy;
import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciReal realF=new FibonacciReal();
		FibonacciProxy proxyF=new FibonacciProxy(realF);
		GetFib ff=(GetFib)Proxy.newProxyInstance(realF.getClass().getClassLoader(),realF.getClass().getInterfaces(), proxyF);
		System.out.println("斐波那契数列:1、1、2、3、5、8、13、21、34、……\n输入第几项：");
		Scanner reader=new Scanner(System.in);
		int fNum=reader.nextInt();
		//ff.getFib(4);
		System.out.println("从1开始斐波那契数列第"+fNum+"项是：  "+ff.getFib(fNum));
	}

}
