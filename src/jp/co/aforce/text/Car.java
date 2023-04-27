package jp.co.aforce.text;

public class Car {
	/* スピードを保存するフィールド */
	protected int speed;
	
	/* オーナーを保存するフィールド */
	private String owner;
	
	/* 	コンストラクターの定義 */
	Car(){
		this.speed = 0;
	}
	
	/* 	コンストラクターの定義 */
	Car(int speed){
		this.speed = speed;
	}
	
	/* スピードを取得するメソッド */
	int getSpeed() {
		return this.speed;
	}
	
	/* スピードを上げるメソッド */
	void speedUp(int value) {
		if(value < 0) {
			return;
		}
		this.speed += value;
		if (this.speed >= 180) {
			this.speed = 180;
		}
	}
	
	/* スピードを下げるメソッド */
	void speedDown(int value) {
		if(value < 0) {
			return;
		}
		this.speed -= value;
		if(this.speed <= -15) {
			this.speed = -15;
		}
	}
	
	/*  */
	String getCarType(){
		return "自動車";
	}
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	String getOwner() {
		return this.owner;
	}
	
	void lock(Key key) {
		System.out.println("鍵でロックしました");
	}
	
	void lock(RemoteController controller) {
		System.out.println("リモコンでロックしました");
	}
	
	final void initialize() {
		this.speed = 0;
	}
}
