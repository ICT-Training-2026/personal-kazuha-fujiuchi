package store;

public class LimitedProduct extends AbsProduct {
	
	//フィールド
	private int dayCnt;
	
	//コンストラクタ
	public LimitedProduct(String name,int price,int dayCnt) {
		super(name,price);
		this.dayCnt=dayCnt;
	}
	
	//メソッド
	public int minusDayCnt(int minus) {
		dayCnt-=minus;
		return dayCnt;
	}
	
	@Override
	public void display() {
		if(dayCnt>0) {
			String display=super.getNamePrice()+"(配送不可)(残り："+dayCnt+"日)";
			System.out.println(display);
		}
	}
}
