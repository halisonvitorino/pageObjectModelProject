package actions;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPageObject;

public class CartActions {
	
	static CartPageObject cartPageObjects;
	
	public CartActions(WebDriver driver) {
		cartPageObjects = new CartPageObject(driver);
	}
	
	static void voltarAsCompras() {
		cartPageObjects.getButttonContinuarComprando().click();
	}

	static void removerProdutosDoCarrinho() {
		cartPageObjects.getButtonRemoverProduto().click();
	}
	
	public void irParaCheckout() {
		cartPageObjects.getButtonCheckOut().click();
	}
}
