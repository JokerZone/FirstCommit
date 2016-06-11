package Text1;

import java.util.Scanner;

public class text2_2 {
	
	/**
	 *2.写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
	 * @author 马宁
	 * @date 2016年4月20日 下午8:26:05
	 */
	public static void main(String[] args) {

		String str="201604";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
	}
	
	//TODO 另一种方法
	/*public static void main(String args[]) throws Exception{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine(); //输入一个字符串
		char c[] = new char[str.length()]; //定义一个字符数组
		for(int i=0;i<str.length();i++){
			c[i] = str.charAt(i);
		}
		for(int i=c.length-1;i>=0;i--) //循环输出
		System.out.print(c[i]); //从倒数第二个字符，向前输出
	}*/

	//FIXME 用toCharArray 转换成char数组然后在反转亦可行
}
