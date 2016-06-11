package TextName2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * 如代码所示，随机生成20个user
 * 
 * 按年龄从小到大排序，若年龄一样，则按姓名升序排，
 * 
 * @author
 *
 */
public class Main3 {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();

		//随机生成
		for (int i = 0; i < 20; i++) {
			String name = UUID.randomUUID().toString().substring(0, 3);
			int age = 20 + new Random().nextInt(10);
			list.add(new User(name, age));
		}
		
		//TODO 代码写在这里面
		//...
		
		
		
		//打印
		for (User user : list) {
			System.out.println(user.name+"  "+user.age);
		}
	}

}

class User {
	public String name;
	public int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
