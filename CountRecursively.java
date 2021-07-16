import java.util.Scanner;

public class CountRecursively {
	public static void countdown(int n) {
		if (n >= 0) {
			System.out.println(n);
			countdown(n - 2);
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("enter a interger ");
		int x = in.nextInt();
		countdown(x);
	}
}