import java.util.Scanner;

public class FibApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		
		FibonacciSeries fib=new FibonacciSeries();
		fib.fibonacci(n);
		
		scan.close();
	}

}
