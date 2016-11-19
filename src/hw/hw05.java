package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		fun1(scn.nextLong());
	}
	public static long fun1(long n) {
		if(n>0){
			System.out.print(n%10);
			return fun1(n/10);
			}else return 0;
	}
}
