package com.euler.level1;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:

 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 find the sum of the even-valued terms.
 */
public class Problem002 {

    private final int LIMIT = 4 * 1000 * 1000; // 4M

	public int countFibonacci() {
        int first = 1;
        int second = 2;
        int result = 0;
        while (second < LIMIT) {
            if (second % 2 == 0) {
                result += second;
            }
            int tmp = first;
            first = second;
            second = tmp + second;
        }
        return result;
    }

}
