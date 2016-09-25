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
public class TestPermutation {
	private static final Logger LOG = LoggerFactory.getLogger(TestPermutation.class);
	
	private void tailRecursivePerm(char[] original,char[] auxilary , int k, int n, int depth) {
		if (k==depth) {
			StringBuilder builder = new StringBuilder("[");
			for(int i=0;i<depth;i++){
				builder.append(original[i]);
				if(i<depth - 1)
				       builder.append(",");
			}
			builder.append("]");
			LOG.info("{}",builder.toString());
			
		}else{
			for(int i=k;i<=n;i++){
				original=copy(auxilary);
				char temp = original[k];original[k]=original[i];original[i]=temp;
				tailRecursivePerm(auxilary,original, k+1, n,depth);
			}
		}
		
	}
	
	private void recursivePerm(char[] A, int k, int n, int depth) {
		if (k==depth) {
			StringBuilder builder = new StringBuilder("[");
			for(int i=0;i<depth;i++){
				builder.append(A[i]);
				if(i<depth - 1)
				       builder.append(",");
			}
			builder.append("]");
			LOG.info("{}",builder.toString());
			
		}else{
			for(int i=k;i<=n;i++){
				char temp = A[k];A[k]=A[i];A[i]=temp;
				recursivePerm(A, k+1, n,depth);
				temp = A[k];A[k]=A[i];A[i]=temp;
			}
		}
		
	}

	private void iterativePerm(char[] A,int depth){
		int m=1;
		int ii=0;
		
		while(ii<factorial(A.length)){
			char[] auxiliary = copy(A);
			
			int jj=0;
			while(jj<factorial(A.length)/A.length){
				for(int kk=1;kk < A.length-1;kk++){
					
					StringBuilder builder = new StringBuilder("[");
					for(int i=0;i<depth;i++){
						builder.append(auxiliary[i]);
						
						if (i < depth-1){
							builder.append(",");
						}
					}
					builder.append("]");
					LOG.info("{}",builder.toString());
					char temp = auxiliary[kk];auxiliary[kk]=auxiliary[kk+1];auxiliary[kk+1]=temp;
					jj++;
					ii++;
				}
			}
			
			if (m < A.length){
				char temp = A[0];A[0]=A[m];A[m]=temp;
				m++;
			}
		}
	}
	

	/**
	 * @param a
	 * @return
	 */
	private char[] copy(char[] a) {
		char[] auxiliary = new char[a.length];
		
		for(int i=0;i<a.length;i++){
			auxiliary[i]=a[i];
		}
		
		return auxiliary;
	}

	/**
	 * @param length
	 * @return
	 */
	private int factorial(int length) {
		int factorial = 1;
		
		for(int i=length;i>0;i--){
			factorial *= i;
		}
		
		return factorial;
	}

	@Test
	public void test() {
		char [] characters = {'a','b','c'};
		
		LOG.info("Tail Recursive permutation");
		tailRecursivePerm(characters,characters,0, characters.length-1,characters.length);
		
		LOG.info("Recursive permutation");
		recursivePerm(characters, 0, characters.length-1,characters.length);
		
		LOG.info("Iterative permutation");
		iterativePerm(characters, characters.length);
		
		assertTrue(true);
	}

}
