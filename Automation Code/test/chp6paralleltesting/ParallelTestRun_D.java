package test.chp6paralleltesting;

import org.testng.annotations.Test;

public class ParallelTestRun_D
{
	@Test
	public void runTestD1 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test D1");		
	}
	
	@Test
	public void runTestD2 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test D2");		
	}
	
	@Test
	public void runTestD3 ()
	{
		System.out.println("Thread # " + Thread.currentThread().getId() + " - Test D3");		
	}
}



































