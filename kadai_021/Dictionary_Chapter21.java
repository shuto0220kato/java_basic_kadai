package kadai_021;


import java.util.HashMap;

// 辞書クラス
public class Dictionary_Chapter21 {
	
	
	// checkWordsを引数として受け取るdictionaryEnglishメソッド
	public void dictionaryEnglish(String[] checkWords) {
	
	
	HashMap<String, String> dictionaryWord = new HashMap<String, String>();
	
	dictionaryWord.put ("apple", "りんご");
	dictionaryWord.put ("peach", "桃");
	dictionaryWord.put ("banana", "バナナ");
	dictionaryWord.put ("lemon", "レモン");
	dictionaryWord.put ("pear", "梨");
	dictionaryWord.put ("kiwi", "キウィ");
	dictionaryWord.put ("strawberry", "いちご");
	dictionaryWord.put ("grape", "ぶどう");
	dictionaryWord.put ("muscat", "マスカット");
	dictionaryWord.put ("cherry", "さくらんぼ");
	
	
	
	
	for(int i = 0; i <  checkWords.length; i++) {
		
		String wordCheck = checkWords[i];
		
		if(dictionaryWord.containsKey(wordCheck)) {
			
			System.out.println(wordCheck + "の意味は" + dictionaryWord.get(wordCheck));
			
		} else {
			System.out.println(wordCheck + "は辞書に存在しません");
		}
		
		
	}
	}
	
	

}
