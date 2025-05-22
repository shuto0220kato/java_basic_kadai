package kadai_028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// じゃんけんクラス
public class Jyanken_Chapter28 {
	
	
	
	

	// 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice(){
		
		
		// sccanerを使って入力して、入力した内容を判定する　クローズを忘れないようにする
		
		// HashMapじゃなくてArrayListを使う？→HashMapを使う指示があった
		HashMap<String, String> jyankenList = new HashMap<String, String>();
		 jyankenList.put("r", "グー");
		 jyankenList.put("s", "チョキ");
		 jyankenList.put("p", "パー");
		 
		


		
		
		//Scannerクラスのオブジェクトを作成する
		Scanner scanner = new Scanner(System.in);
		
		// returnで返ってきた値を入れる入れ物が必要
		String myJyanken;
		
		
		
		// エラーがでたら再度繰り返すからwhile文
		// while文の中で、入力→判定を行う
		// .equals()を使って、trueが出たら次の文？→無理そうcontainsKey()を使う
		
		// エラーを扱うからtry\catchを使うと思う→if文でやる
		while (true) {

				
			System.out.println("自分のじゃんけんの手を入力しましょう");
				
			myJyanken = scanner.next();
				
			if (jyankenList.containsKey(myJyanken)){
				
				// じゃんけんの手がr,s,pならwhileを終わらせて次に進む
				break;
				
				
			} else {
				
				// じゃんけんの手がr,s,p以外のとき、もう一回入力させる
				System.out.println("グーはrockのrを入力しましょう");
				System.out.println("チョキはscissorsのsを入力しましょう");
				System.out.println("パーはpaperのpを入力しましょう");
			}
			
		}
		
		scanner.close();
		
		return myJyanken;
		

	}
	
	
	
	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		
		// 配列じゃなくHashMapを使うよう指示あり
		HashMap<String, String> jyankenList = new HashMap<String, String>();
		 jyankenList.put("r", "グー");
		 jyankenList.put("s", "チョキ");
		 jyankenList.put("p", "パー");
		
		// jyankenListからr,s,p(キー)をインデックスつきの配列として取り出す必要がある
		// キーを指定してグー、チョキ、パーを取り出すなら.getとすればいいけど、今回はキーを取り出したい
		// Listを使う importも追加する
		 ArrayList<String> keyList = new ArrayList<>(jyankenList.keySet());
		
		
		// 整数部分が0、1、2の値を出す
		double randomZeroToTwo = Math.random() * 3;
		
		// randomZeroToTwoから整数部分だけを取り出す double型からint型に変換するからキャスト変換する
		int randomInt = (int)Math.floor(randomZeroToTwo);
		
		return keyList.get(randomInt);
		
		
		
	}
	
	
	// じゃんけんを行うメソッド
	public void playGame() {
		
		
		// 自分の手
		String myHand = getMyChoice();
		
		// 相手の手
		String randomHand = getRandom();
		
		// そのままだとr,s,pが出力されるから、HashMapを使う
		HashMap<String, String> jyankenList = new HashMap<String, String>();
		 jyankenList.put("r", "グー");
		 jyankenList.put("s", "チョキ");
		 jyankenList.put("p", "パー");
		
		
		// 自分の手と対戦相手の手を出力する
		System.out.println("自分の手は" + jyankenList.get(myHand) + "，対戦相手の手は" + jyankenList.get(randomHand));
		
		// equals()メソッドを使う？→でもtrueかfalseしかでないから、compareTo()を使って、1,0,-1を取得して、結果を出力する？
		// →正負で勝ち負けが決まるわけじゃない→関係性を表にする必要がある→これもHashMap？
		// それぞれが勝組み合わせだけ決めれば、引き分けは.equals()にして、あとは勝ちとそれ以外にすれば条件分岐できる。
		
		
		HashMap<String, String> jyankenWin = new HashMap<String, String>();
		
		// グーが勝つ
		jyankenWin.put("r", "s");
		// チョキが勝つ
		jyankenWin.put("s", "p");
		// パーが勝つ
		jyankenWin.put("p", "r");
		
		
		// それぞれの手を比較するif文
		if(myHand.equals(randomHand)) {
			System.out.println("あいこです");
		}else if(jyankenWin.get(myHand).equals(randomHand)){// 例えば、rをキーにして呼び出したsがrandomHandと同じなら、それはrがsに勝っていることになる
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
		
		
		
	}
}
