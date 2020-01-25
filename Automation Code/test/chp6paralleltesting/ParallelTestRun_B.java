package test.chp6paralleltesting;

import org.testng.annotations.Test;

public class ParallelTestRun_B
{
	@Test
	public void runTestB1 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test B1");		
	}
	
	@Test
	public void runTestB2 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test B2");		
	}
	
	@Test
	public void runTestB3 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test B3");		
	}
}























