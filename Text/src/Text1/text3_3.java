package Text1;

import java.util.Scanner;

/**
 *3.输入一个十进制整数，计算该整数二进制中1的个数
 * @author 马宁
 * @date 2016年4月20日 下午9:06:50
 */

//FIXME 此题难度甚高，虽然网上找到答案，相关逻辑有待思考清楚
public class text3_3 {

	public static int findNumberOf1(int k){
		int count=0;
		int num=1;
		for(int i=1;i<=Integer.SIZE;i++){
			if((k&num)!=0)count++;
			num=2*num;
		}
		return count;
	}
	public static void main(String[] args) {
		    Scanner input=new Scanner(System.in);
		    int k=input.nextInt();
		    System.out.println( findNumberOf1(k));
	}
}
