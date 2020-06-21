package com.synechron;

public class Test1b {

	public static void main(String[] args) {

		/**
		 * A non-final local variable or method parameter whose value is never
		 * changed after initialization is known as effectively final
		 */
		String eFinal = "Hello ";
		Printer printer = new Printer() {
			
			@Override
			public void print(String text) {
				String print = eFinal + text;
				System.out.println(print);
				//eFinal += "Hi";
				/**
				 * If we try to change the value of variable it throws an compilation error showing
				 * Local variable eFinal defined in an enclosing scope must be final or effectively final
				 * */
			}
		};
		
		printer.print("Sachin");
	}

}

interface Printer{
	void print(String text);
}
