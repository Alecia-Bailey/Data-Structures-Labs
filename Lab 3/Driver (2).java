
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
	}
	
}
