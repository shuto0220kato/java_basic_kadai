package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		// Dictionary_Chapter21をインスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 配列を作る
		String[] searchWords = {"apple","banana","grape","orange"};
		
		
		// 辞書を調べるメソッドを引数指定で呼び出す→配列を引数として（）に入れる？
		dictionary.dictionaryEnglish(searchWords);
	}

}
