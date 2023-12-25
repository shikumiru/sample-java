package hero;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生成");
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();

	}

}
