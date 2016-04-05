import java.util.Scanner;

public class MethodDemo {
	public static void main(String[] args) {
		int x = input('x');
		int y = input('y');
		int z = input('z');
		
		System.out.println("h(x) = " + x + "^10 = " + h(x));
		System.out.println("f(x) = " + x + " + " + y + " = " + f(x,y));
		System.out.println("g(x) = sqrt(" + x + ") + |" + y + "| + " + z + "^" + y + " = " + g(x,y,z));
	}
	
	static long h(int x) {
		return Power(x,10);
	}
	
	static long f(int x, int y) {
		return x + y;
	}
	
	static double g(int x, int y, int z) {
		return (Sqrt(x) + Abs(y) + Power(z,y));
	}
	
	static long Power(int num, int pow) {
		if (pow == 0) 
			return 1;
		else 
			return num * Power(num,pow-1);
	}
	
	static long Abs(int num) {
		if (num < 0) return -num;
		else return num;
	}
	
	static double Sqrt(int num) {
		double n, sqrt = num / 2; 
		do {
			n = sqrt;
			sqrt = (n + (num/n))/2;
		} while ((n-sqrt)!=0);
		return sqrt;
	}
	
	static int input(char value) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for " + value + " : ");
		return input.nextInt();
	}
}