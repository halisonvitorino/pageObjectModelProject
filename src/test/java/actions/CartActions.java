package actions;

import pageObjects.CartPageObject;
import utils.BrowserAndPageManager;

public class CartActions extends BrowserAndPageManager{
	
	CartPageObject cartPageObjects = new CartPageObject();
	
	public void voltarAsCompras() {
		cartPageObjects.getButttonContinuarComprando().click();
	}

	public void removerProdutosDoCarrinho() {
		cartPageObjects.getButtonRemoverProduto().click();
	}
	
	public void irParaCheckout() {
		cartPageObjects.getButtonCheckOut().click();
	}
}
