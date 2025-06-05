package store;

public class NormalProduct extends AbsProduct implements Deliverable {
	
	//フィールド
	
	//コンストラクタ
	public NormalProduct(String name,int price) {
		super(name,price);
	}
	
	//メソッド
	@Override //抽象クラス
	public void display() {
		String display=super.getNamePrice();
		System.out.println(display);
	}
	
	@Override //インターフェイス
	public void displayDeliv() {
		System.out.println("【*通常送料	500円*】"+super.getNamePrice());
	}

}
