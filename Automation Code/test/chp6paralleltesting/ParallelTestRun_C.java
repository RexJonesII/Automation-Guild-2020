package test.chp6paralleltesting;

import org.testng.annotations.Test;

public class ParallelTestRun_C
{
	@Test
	public void runTestC1 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test C1");		
	}
	
	@Test
	public void runTestC2 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test C2");		
	}
	
	@Test
	public void runTestC3 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test C3");		
	}
}





























