package test.chp6paralleltesting;

import org.testng.annotations.Test;

public class ParallelTestRun_E
{
	@Test
	public void runTestE1 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test E1");		
	}
	
	@Test
	public void runTestE2 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test E2");		
	}
	
	@Test
	public void runTestE3 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test E3");		
	}
}




























