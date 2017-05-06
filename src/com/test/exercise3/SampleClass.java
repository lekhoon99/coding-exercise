package com.test.exercise3;

import java.lang.reflect.Method;

public class SampleClass {
	
	public static void main(String[] args) {
		
		//Initialize a new timer
		Timer t = new Timer();
		
		try {
			Thread.sleep(300);
			method1();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//End the timer and get the elapse time
		System.out.println("Execution time in main method:" + t.getElapseTime());
	}
	
	private static void method1() {
		
		//Initialize a new timer
		Timer t = new Timer();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		//End the timer and get the elapse time
		System.out.println("Execution time in method1:" + t.getElapseTime());
	}

}
