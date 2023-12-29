package hero;

import java.util.ArrayList;
import java.util.List;

public class Main16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero2 h1 = new Hero2("加藤");
		Hero2 h2 = new Hero2("佐藤");
		List<Hero2> heroes = new ArrayList<Hero2>();
		heroes.add(h1);
		heroes.add(h2);
		for (Hero2 h : heroes) {
			System.out.println(h.getName());
		}

	}

}
