package com.fe;

public class FibonacciReal implements GetFib{
	@Override
	
	public int getFib(int i){
		 if (i == 1 || i == 2)
			  return 1;
			  else
			  return getFib(i - 1) + getFib(i - 2);			 
	}
}