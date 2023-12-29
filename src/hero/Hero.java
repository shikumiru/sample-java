package hero;

public class Hero {
	
	String name;
	int hp;
	Sword sword;
	
	public void attack() {
		System.out.println(this.name + "は攻撃");
		System.out.println("敵に5ポイントダメージ");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5ダメージ");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HP" + this.hp);
	}

}
