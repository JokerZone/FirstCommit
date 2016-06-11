package Filedfile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import java.util.Comparator;
import java.text.Collator;
import java.util.Locale;
import java.util.Collections;
/**
 *如代码所示，随机生成20个user
 *
 *按年龄从小到大排序，若年龄一样，则按姓名升序排，
 * @author 马宁
 * @date 2016年4月29日 下午2:18:47
 */
public class Main2_3 {

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
		
		/**
		 * @desc AscAgeComparator比较器 它是“User的age的升序比较器”
		 */
		class AscAgeComparator implements Comparator<User> {
		    @Override
		    public int compare(User u1, User u2) {
		        return u1.getAge() - u2.getAge();
		    }
		}
		/**
		 * @desc AscAgeComparator比较器 它是“User的Name的升序比较器”
		 */
		class AscNameComparator implements Comparator<User> {
		    @Override
		    public int compare(User u1, User u2) {
		        String one = u1.getName();
		        String two = u2.getName();
		        Collator ca = Collator.getInstance(Locale.CHINA);
		        int flags = 0;
		        if (ca.compare(one, two) < 0) {
		            flags = -1;
		        } else if (ca.compare(one, two) > 0) {
		            flags = 1;
		        } else {
		            flags = 0;
		        }
		        return flags;
		    }
		}
		
		//FIXME 此处应做判断，如果年龄相同，则按姓名排序（调用AscNameComparator()）

			Collections.sort(list, new AscAgeComparator());			

			//Collections.sort(list, new AscNameComparator());
		
		//打印
		for (User user : list) {
			System.out.println(user.name+"  "+user.age);
		}
	}

}



class User implements Comparable<User>{
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

	public int getAge() {
		return age;
	}

	public String toString() {
		return name + " - " + age;
	}

	
	/**
     * 比较两个Person是否相等：若它们的name和age都相等，则认为它们相等
     */
	boolean equals(User user) {
		if (this.age == user.age && this.name == user.name)
			return true;
		return false;
	}
	
	@Override
	public int compareTo(User user) {
		// TODO Auto-generated method stub
		return name.compareTo(user.name);
        // return this.name - person.name;
	}
	
}
