
public class MathClassDemo {
	public static void main(String[] args) {
		int pos = (int)(Math.random()*10);
		int neg = (int)(-Math.random()*10);
		double realNum = Math.random();
		
		// Math.pow
		int pow = (int)(Math.random()*10);
		System.out.println(pos + "^" + pow + " = " + Math.pow(pos, pow));
		
		// Math.sqrt
		System.out.println("Sqrt of " + pos + " = " + Math.sqrt(pos));
		
		// Math.abs
		System.out.println("Abs of " + neg + " = " + Math.abs(neg));
		
		// Math.random
		System.out.println("Random number 1 to 9 : " + (int)(Math.random()*10));
		
		// Math.max
		System.out.println("Max between " + pos + " and " + pow + " = " + Math.max(pos, pow) );
		
		// Math.min
		System.out.println("Min between " + neg + " and " + -pow + " = " + Math.min(pos, -pow));
		
		// Math.round
		System.out.println("Round of " + realNum + " = " + Math.round(realNum));
		
		// Math.floor 
		System.out.println("Floor of " + realNum + " = " + Math.floor(realNum));
		
		// Math ceil
		System.out.println("Ceil of " + realNum + " = " + Math.ceil(realNum));
		
		
	}
}
