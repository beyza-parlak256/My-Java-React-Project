package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}
		else {
			System.out.println("�r�n bilgileri ge�ersizdir");
		}
	}
	
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	} // inner class
}
