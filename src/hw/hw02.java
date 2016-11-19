package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun1(n, 0));
	}
	public static int fun1(int n, int a) {
		if (n == 0) {
			return a;
		}else{
			return fun1(n/10,(a+1));
		}
	}

}
