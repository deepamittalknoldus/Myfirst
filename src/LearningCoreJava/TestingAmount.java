package LearningCoreJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingAmount {

	@Test
	void test() 
	{
		TransactionCheckService tcs = new TransactionCheckService ();
		Boolean result = tcs.isAllowed(null, null, 25);
		assertEquals(true, result);
	}

}
