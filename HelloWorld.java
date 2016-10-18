public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World 2");
		System.out.println(sum(1, 2));
		System.out.println(mul(1, 2));
    }
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static double mul(double a, double b) {
		return a * b;
	}
	
}