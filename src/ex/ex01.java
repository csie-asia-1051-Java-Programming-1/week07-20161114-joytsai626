package ex;
import java.util.*;
/*�мg�@�ӵ{���A�ΰ}�C�x�s�ϥΪ̿�J�� n �Ӿ�ơA�z�L�禡 var() �i�H�^�ǭp��Ӱ}�C�̪��Ʀr���ܲ��ƫ�A�C�L�X���G
 * Date: 2016/11/14
 * Author: 105021013
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		int data[] = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++){
			data[i] = scn.nextInt();
			sum = sum + data[i];
		}
		float u = sum/n;
		float ans=var(data, n-1,u);
		System.out.println(ans);
	}

	public static float var(int[] data1, int n1, float u1) {
		if(n1 == 1){
			return 1;
		}else{
			return (((data1[n1]-u1)*(data1[n1]-u1))/n1)+ ((data1[n1-1]-u1)*(data1[n1-1]-u1))/n1;
	}
	}
}
