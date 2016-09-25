/**
 * Proprietary & Confidential  |  © 2016 PhaseZero Ventures LLC
 * 
 * The content of this file cannot be copied and/or distributed without 
 * the express permission of PhaseZero Ventures LLC
 */
package edu.ds.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author PhaseZero Ventures
 *
 */
public class TestTailEndRecursiveUtil {
	private static final Logger LOG = LoggerFactory.getLogger(TestTailEndRecursiveUtil.class);
	
	@Test
	public void testFactorial() {
		int num = 5;
		LOG.info("Factorial of {} is {}",num,TailEndRecursiveUtil.factorial(num));
		assertTrue(true);
	}

	@Test
	public void testFibonacci(){
		int num=6;
		LOG.info("Fibonacci number at position {} is {}",num,TailEndRecursiveUtil.fibonacci(num));
		assertTrue(true);
	}
	
	@Test
	public void testPermutation(){
		String pattern="abcd";
		LOG.info("Permutations of pattern {} is {}",pattern,TailEndRecursiveUtil.permutation(pattern));
		assertTrue(true);

	}
	
}
