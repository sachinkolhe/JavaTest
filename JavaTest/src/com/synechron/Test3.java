package com.synechron;

import java.util.Arrays;

public class Test3 {

	/**
	 * write a page replacement algorithm to
	 * replace new page. Whenever new page comes in and not present in memory , the page fault
	 * occurs and OS replace one of existing page with new one.
	 * 
	 */
	public static void main(String[] args) {

		int[] pages = new int[] { 5, 0, 1, 3, 2, 4, 1, 0, 5 }; //expected output 8
		//number of pages available
		//int[] pages = new int[] {0, 2, 1, 6, 4, 0, 1, 0, 3, 1, 2, 1 }; //expected output 9
		//pageCount
		int pageCount = 4;
		//to calculate the pageFualt
		int pageFault = 0;
		//traverse over mem array
		int index = 0;
		int[] mem = new int[pageCount];
		//fill out the array with some default value
		Arrays.fill(mem, Integer.MIN_VALUE);
		for (int pg : pages) {
			//to check requested page is present on memory
			boolean present = Arrays.stream(mem).filter(x -> x == pg).findAny().isPresent();
			//if NOT present
			if (!present) {
				mem[index++] = pg;
				pageFault++;
				if (index >= pageCount) {
					index = 0;
				}
			}
		}
		
		System.out.println("Page Fault : " + pageFault);
	}

}
