package Text2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 *如代码所示，随机生成20个user
 *
 *按年龄从小到大排序，若年龄一样，则按姓名升序排，
 * @author 马宁
 * @date 2016年4月29日 下午2:18:47
 */
public class Main3 {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();

		// 随机生成
		for (int i = 0; i < 20; i++) {
			String name = UUID.randomUUID().toString().substring(0, 3);
			int age = 20 + new Random().nextInt(10);
			list.add(new User(name, age));
		}

		// TODO 代码写在这里面
		// ...

		ComparatoUser com=new ComparatoUser();
		Collections.sort(list, com);
		
		// 打印
		for (User user : list) {
			System.out.println(user.name + "  " + user.age);
		}
	}

}

// 具体的比较类，实现Comparator接口

class ComparatoUser implements Comparator<User> {
	public int compare(User u0, User u1) {
		User user0 = (User) u0;
		User user1 = (User) u1;

		// 首先比较年龄，如果年龄相同，则比较名字
		int flag = user0.getAge() - (user1.getAge());

		if (flag == 0) {
			return user0.getName().compareTo(user1.getName());
		} else {
			return flag;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
