package jp.co.diworks.iphone;

//演習2 extends~でMp3Playerクラスから継承している
public class SmartPhone extends Mp3Player{

	public static void main(String[] args) {
		
	}

	public void call() {
		System.out.println("電話");
	}
	public void mail() {
		System.out.println("メール");
	}
	public void photo() {
		System.out.println("写真");
	}
	public void internet() {
		System.out.println("インターネット");
	}
	
	//演習4 オーバーライド
	public void play() {
		System.out.println("再生(ハイレゾ機能)");
	}
	public void stop() {
		System.out.println("停止(ハイレゾ機能)");
	}
	public void next() {
		System.out.println("次へ(ハイレゾ機能)");
	}
	public void back() {
		System.out.println("戻る(ハイレゾ機能)");
	}
}
