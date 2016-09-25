/**
 * Proprietary & Confidential  |  © 2016 PhaseZero Ventures LLC
 * 
 * The content of this file cannot be copied and/or distributed without 
 * the express permission of PhaseZero Ventures LLC
 */
package edu.ds.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author PhaseZero Ventures
 *
 */
public class TailEndRecursiveUtil {
	
	public static List<String> permutation(String pattern){
		return perm(pattern.toCharArray(),pattern.toCharArray(),0,null);
	}
	
	public static int factorial(int num){
		return fact(num,1);
	}

	public static int fibonacci(int num){
		return fib(num,0,1);
	}
	
	/**
	 * Recursive function to generate permutations of pattern string (TailEnd recursion ?)
	 * @param original char array
	 * @param auxilary char array
	 * @param index for character fixation in array
	 * @return
	 */
	private static List<String> perm(char[] original, char[] auxilary, int k,List<String> aggr) {
		if (k==original.length){
			if (Objects.isNull(aggr)){
				aggr = new ArrayList<>();
			}
			aggr.add(String.valueOf(original));
		}else{
			for (int ii=k;ii < original.length;ii++){
				original = Arrays.copyOf(auxilary, original.length);
				char tempChar = original[k];original[k]=original[ii];original[ii]=tempChar;
				aggr= perm(auxilary, original, k+1, aggr);
			}
		}
		
		return aggr;
	}
	
	/**
	 * TailEnd recursive function to calculate fibonacci number 
	 * @param num
	 * @param i
	 * @param j
	 * @return
	 */
	private static int fib(int pos, int num01, int num02) {
		if (pos <=1){
			return num02;
		}else{
			return fib(pos-1, num02, num02+num01);
		}
	}

	/**
	 * TailEnd recursive function to calculate factorial
	 * @param num
	 * @param aggr
	 * @return
	 */
	private static int fact(int num, int aggr) {
		if (num <=1){
			return aggr;
		}else{
			return fact(num-1, aggr*num);
		}
		
	}
}
