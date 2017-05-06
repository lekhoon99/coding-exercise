package com.test.exercise3;

import java.util.concurrent.TimeUnit;

public class Timer {

	private long startTime;
	private long endTime;
	
	public Timer() {
		start();
	}
	
	private void start() {
		startTime = System.nanoTime();
	}
	
	private void end() {
		endTime = System.nanoTime();
	}
	
	//Return elaspse time in milliseconds
	public long getElapseTime() {

		end();
		long elapseTimeInNanoSeconds = endTime - startTime;
		
		//convert to milliseconds
		return TimeUnit.NANOSECONDS.toMillis(elapseTimeInNanoSeconds); 
	}
	
}
