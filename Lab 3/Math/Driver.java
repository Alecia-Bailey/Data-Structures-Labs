package Math;

public class Driver {
	public static void main(String[] args) {
			IterationMathLib iterationLibrary = new IterationMathLib();
			RecursiveMathLib recursionLibrary = new RecursiveMathLib();
			System.out.println ("------Iteration------");
			runTestCode(iterationLibrary);
			System.out.println("----Recursion---");
			runTestCode(recursionLibrary);
		}
		public static void runTestCode(MathLib library) {
			System.out.println("GCD (4,2) = "+library.gcd(4,2));
			System.out.println("Ack (8,4) = "+library.ack(8,4));
			System.out.println("Fib (6,0) = "+library.fib(6));
			System.out.println("Hanoi (2,0) = "+library.hanoi(2));
		}
		
}


