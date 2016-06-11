package Text2;

/**
 *
 *已知如下数列，从第三项开始，每项的值为前面两项之和。求第20项的值
 *
 *eg：0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 * @author 马宁
 * @date 2016年4月29日 下午2:16:48
 */
public class Main2 {

	public static void main(String[] args) {
		
		int a=1,b=1,c,sum = 0;//a，b为前两项，均为1 
		for( int i=3;i<20;i++){
		c=a+b;//生成的新项置放在变量c中 
		a = b; //原来的第二个数成为新的第一个数 
		b = c;//原来的第三个数成为新的第二个数
		sum=a+b;
		}
		System.out.println("\n"+"sum=" + sum);
		
	}

}

