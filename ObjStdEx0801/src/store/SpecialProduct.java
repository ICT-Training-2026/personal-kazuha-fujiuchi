package store;

public class SpecialProduct extends AbsProduct implements Deliverable{
	
	//フィールド
	private int orgPrice; //定価
	
	//コンストラクタ
	public SpecialProduct(String name,int price,int orgPrice){
		super(name,price);
		this.orgPrice=orgPrice;
	}
	
	//メソッド
	@Override
	public void display() {
		String display = super.getNamePrice()+"(定価："+orgPrice+"円)";
		System.out.println(display);
		
	}
	
	@Override //インターフェイス
	public void displayDeliv() {
		System.out.println("【*特別送料300円*】"+super.getNamePrice());
	}
	@Override
	public String toString() {
		return "このインスタンスはSpecialProduct型です";
		
	}
}
