package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int m = scn.nextInt();
       int n = scn.nextInt();
       int a = fun(m);
       int b = fun(n);
       int c = fun(m-n);
       System.out.println(a/(b*c));
	}
	public static int fun(int x){
		if(x == 1){
		    	   return 1;
		       }else{
		    	   return x*fun(x-1);}
    		}
    	}