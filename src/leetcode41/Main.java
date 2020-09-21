package leetcode41;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {3,4,-1,1};
		
		System.out.println("Input: " + Arrays.toString(A));
		
		FindFirstPositive solution = new FindFirstPositive();
		
		System.out.println("Solution: " + solution.firstMissingPositive(A));
		
	}
}
