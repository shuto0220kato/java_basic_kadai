package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	
	// デフォルトコンストラクタ（省略してもいいけどあえて書いておく）

	public KatoIchiro_Chapter18() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// givenNameに名前を挿入する。このgivenNameはフィールドだからthisをつける。
	public void setGivenName() {
		this.givenName = "一郎";
	}

	
	// 個別の紹介
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
		
	}

}
