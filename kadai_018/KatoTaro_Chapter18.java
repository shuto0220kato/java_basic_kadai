package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	
	
	
	
	// デフォルトコンストラクタ（省略してもいいけどあえて書いておく）
	public KatoTaro_Chapter18() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// givenNameに名前を挿入する。このgivenNameはフィールドだからthisをつける。
	public void setGivenName() {
		this.givenName = "太郎";
	}

	// 個別の紹介
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
		
	}
	
}