package kadai_015;

public class Car_Chapter15 {

	private int gear = 1; 
	private int speed = 10;
	
	// ギアの値により速度を変える
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		// 変更後のギアの値を元のフォール度に挿入する
		this.gear = afterGear;
		
		this.speed = switch(gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
