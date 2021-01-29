package leetcode41;

public class FindFirstPositive {
	public int firstMissingPositive(int[] A) {
		int i = 0;

		while (i < A.length) {
			// Swap with pointless value until everything in order
			if (A[i] > 0 && A[i] <= A.length && A[A[i] - 1] != A[i]) {
				swap(A, i, A[i] - 1);
			} else { // Check next element
				i++;
			}
		}

		i = 0;

		// Find first smallest number
		while (i < A.length && A[i] == i + 1) {
			i++;
		}

		// Since first positive integer is 1
		return i + 1;
	}

	// Helper method to swap
	private void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
