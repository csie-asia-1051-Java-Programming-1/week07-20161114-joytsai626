package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int x = scn.nextInt();
       int y = scn.nextInt();
       int z = scn.nextInt();
       System.out.println("x,y,z的最小公倍數為   " + lcm(x,y,z));
	}
    public static int lcm(int x,int y,int z){
    	int max = 1;
    	int xy=1;
        for (int i=1;i<=x;i++) {
            if (x%i == 0 && y%i == 0){
                max = i;
            }
        }
        xy=x*y/max;
        for(int i=1;i<=xy;i++){
            if (xy%i == 0 && z%i == 0){
                max = i;
            }
        }
		return xy*z/max;
	}
}
