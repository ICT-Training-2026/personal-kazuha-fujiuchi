package drive;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {
	
	//メインメソッド
	public static void main(String[] args) {
		
		AbsProduct[] product=makeProductList();
		
//		for(int i=0;i<product.length;i++) {
//			if(product[i]instanceof LimitedProduct) {
//				LimitedProduct prod = (LimitedProduct)product[i];
//				
//				prod.minusDayCnt(4);
//				
//				//product[i]=prod;参照型だからいらない（アドレスは同じ）
//			}
//		}
		displayPriductList(product);
		if(product[1] instanceof SpecialProduct) {
			SpecialProduct sProd=(SpecialProduct)product[1];
			System.out.println("サブクラスの型からインターフェイスメソッドを呼び出し");
			sProd.displayDeliv();
			
			if(sProd instanceof Deliverable) {
				
				Deliverable deProd =(Deliverable)sProd;
				System.out.println("インターフェイスクラス型からインターフェイスメソッドを呼び出し");
				deProd.displayDeliv();
			}
		}
		System.out.println();
		
		Deliverable[] deliv =getDeliverable(product);
		
		displayDelivList(deliv);
		System.out.println("toString()の結果："+product[1].toString());
		
	
		
	}
		
	
	//メソッド
	
	static  AbsProduct[] makeProductList() {
			
			AbsProduct[] product = {
					new LimitedProduct("マウス", 2000, 10),
					new SpecialProduct("特化キーボード", 3600, 4500),
					new LimitedProduct("Webカメラ", 3900, 7),
					new NormalProduct("マイク",2800),
					new SpecialProduct("ディスプレイ", 15000, 20000),
					new NormalProduct("LED照明", 4200)
			};
			
			return product;
			
	}
	
	static void displayPriductList(AbsProduct[] product){
		System.out.println("---商品リスト---\n");
		for(int i=0;i<product.length;i++) {
			product[i].display();
			System.out.println();
		}
	}
	
	static Deliverable[] getDeliverable(AbsProduct[] prod) {
		Deliverable[] deliv = new Deliverable[prod.length];
		int dCnt=0;
		
		for(int i=0;i<deliv.length;i++) {
			
			if(prod[i] instanceof Deliverable) {
				
				deliv[dCnt]=(Deliverable)prod[i];
				dCnt++;
				
			}
		}
		
		return deliv;
		
	}
	
	static void displayDelivList(Deliverable[] deliv) {
		System.out.println("---配達可能商品---\n");
		
		for(int i=0;i<deliv.length;i++) {
			
			if(deliv[i]==null) {
				
				break;
				
			}
			
			deliv[i].displayDeliv();
			
		}
		
	}
	
}


