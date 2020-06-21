package com.synechron;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {

		//int[] pages = new int[] { 5, 0, 1, 3, 2, 4, 1, 0, 5 };
		int[] pages = new int[] {0, 2, 1, 6, 4, 0, 1, 0, 3, 1, 2, 1 };
		int pageCount = 4, pageFault = 0, index = 0;
		int[] mem = new int[pageCount];
		Arrays.fill(mem, Integer.MIN_VALUE);
		for (int pg : pages) {
			boolean bool = Arrays.stream(mem).filter(x -> x == pg).findAny().isPresent();
			if (!bool) {
				mem[index++] = pg;
				pageFault++;
				if (index >= pageCount) {
					index = 0;
				}
			}
		}
		
		System.out.println(pageFault);
	}

}
