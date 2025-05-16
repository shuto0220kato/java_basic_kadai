package kadai_018;


// 親クラス　姓と名と住所を表すフィールドを持つ
abstract public class Kato_Chapter18 {
	
	// 姓を表すフィールド
	public String familyName = "加藤";
	
	// 名を表すフィールド
	public String givenName;
	
	// 住所を表すフィールド
	public String address = "東京都中野区〇×";
	
	
	public Kato_Chapter18() {
		
	}
	
	// コンストラクタで初期化
	public Kato_Chapter18(String familyName, String givenName, String address) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.address = address;
	}
	
	public Kato_Chapter18(String givenName) {
		this.givenName = givenName;
	}
	
	
	
	// 共通の紹介を出力するメソッド
	public void commonIntroduce() {
		
		// 名前は〇〇です
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		
		// 住所は○○です
		System.out.println("住所は" + this.address + "です");
		
	}
	
	// 個別の紹介を出力する
	abstract public void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		
		commonIntroduce();
		eachIntroduce();
		
		
	}
	
	
	

}
