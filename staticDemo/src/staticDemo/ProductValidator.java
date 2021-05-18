package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static yap�c� blok �al��t�");
	}
	
	// statikler class ismiyle �a�r�l�r
	public static boolean isValid(Product product) {
		
		if(product.price > 0 && !product.name.isEmpty()) {
		return true;
		}
		else {
			return false;
		}
	}
	
}
