package apr0424;

import apr0224.AlgorithmHelper;

public class Analyzer {

	private AlgorithmHelper helper;

	public Analyzer() {
		helper = new AlgorithmHelper();
	}

	/**
	 * O(1)
	 * 
	 * @param n
	 * @return
	 */
	int bigO1(int n) {
		return 1; // <- does 1 thing // 1
	}

	/**
	 * O(n)
	 * 
	 * @param n
	 * @return
	 */
	int bigOn(int n) {
		int[] list = helper.getArrayRando(n);

		int count = 0; // 1
		for (int i = 0; i < list.length; i++) { // n
			count += 1; // 1 <- actually (1 * n)
		}
		return count; // 1

		// 1 + (1+n) + 1 important steps
		// = n + 3 ->> O(n+3) --> O(n)
	}

	/**
	 * O(n^2)
	 * 
	 * @param n
	 * @return
	 */
	int bigOnxn(int n) {
		int[][] list = new int[n][n];

		int count = 0; // 1
		for (int i = 0; i < list.length; i++) { // n
			for (int j = 0; j < list.length; j++) { // n ->> n*n
				list[i][j] = ++count; // 1 ->> 1 * (n * n)
			}
		}
		return count; // 1

		// 1 + 1 *(n * n) = O(1+1(n*n)) = O(n^2)
	}

	/**
	 * O(lg n)
	 * 
	 * @param n
	 * @return
	 */
	int bigOlgn(int n) {
		int[] list = helper.getArrayRando(n);

		int count = 0; // 1
		for (int i = n; i > 0; i /= 2) { // lg n
			count += 1; // 1 --> 1(lg n)
		}
		return count; // 1

		// 1 + 1(lg n) + 1 = O(lg n)
	}

	int bigOnlgn(int n) {
		int[] list = helper.getArrayRando(n);

		int count = 0; // 1
		for (int j = 0; j < list.length; j++) { // n
			for (int i = n; i > 0; i /= 2) { // lg n --> n*(lg n)
				count += 1; // 1 --> 1(lg n) --> n*1(lg n)
			}
		}
		return count; // 1
		
		// n (1 + 1(lg n) + 1) = O(n lg n)
	}
}
