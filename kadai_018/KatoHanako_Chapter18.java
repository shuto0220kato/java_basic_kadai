package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	// デフォルトコンストラクタ（省略してもいいけどあえて書いておく）

	public KatoHanako_Chapter18() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// givenNameに名前を挿入する。このgivenNameはフィールドだからthisをつける。
	public void setGivenName() {
		this.givenName = "花子";
	}

	
	// 個別の紹介
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
		
	}

}
