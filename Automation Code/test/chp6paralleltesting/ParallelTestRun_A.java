package test.chp6paralleltesting;

import org.testng.annotations.Test;

public class ParallelTestRun_A
{
	@Test
	public void runTestA1 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test A1");		
	}
	
	@Test
	public void runTestA2 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test A2");		
	}
	
	@Test
	public void runTestA3 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test A3");		
	}
}

























