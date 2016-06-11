package Text1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class text1_1 {

	/**
	 * 1.输入一个日期格式的字符串（YYYYMMDD），计算两个日期的差值
	 * @author 马宁  
	 * @date 2016年4月20日 下午8:17:45 
	 */
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
		String date1 = "20160420";
		String date2 = "20160422";

		Long a = sf.parse(date2).getTime()-sf.parse(date1).getTime();
		long b = a/1000/60/60/24;
				
		System.out.println(b);
		
	}

}
