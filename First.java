package com.example.rgit;

public class First {
	int firstNum=100;
	int secondNum=100;
	
	void subraction() {
		int sub = firstNum - secondNum;
		System.out.println(sub);
	}
	void multiplication() {
		int msum = firstNum * secondNum;
		System.out.println(msum);
			
	}
	void addition() {
		int sum = firstNum + secondNum;
		
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		First object =new First();
		object.addition();
		
		object.multiplication();
		
		object.subraction();
	}

}
