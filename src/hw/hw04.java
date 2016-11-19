package hw;
import java.util.*;
public class hw04 {
/*寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(lcm(m,n));
	}
    public static int lcm(int m,int n){
    	int r = m%n;
    	if(r == 0){
    		return n;
    	}else{
    	return lcm(n,r);
    	}
    }
}
