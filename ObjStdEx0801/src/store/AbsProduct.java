package store;

public abstract class AbsProduct {
	//フィールド
	private String name;
	private int price;
	
	//コンストラクタ（抽象クラスなのでprotected）
	protected AbsProduct(String name,int price) {
		this.name=name;
		this.price=price;
	}
	
	//メソッド
	
	//抽象メソッド
	public abstract void display(); 
	
	protected String getNamePrice() {
		return name+":"+price+"円";
	}
}
