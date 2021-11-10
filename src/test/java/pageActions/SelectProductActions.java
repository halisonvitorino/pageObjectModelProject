package pageActions;

import pageObjects.SelectProductPageObject;
import utils.BrowserAndPageManager;

public class SelectProductActions extends BrowserAndPageManager{
	
	SelectProductPageObject selectProductPageObject = new SelectProductPageObject();
	
	public void escolherProduto() {
		selectProductPageObject.getProductSauceLabsBackpackButton().click();
		selectProductPageObject.getCarrinho().click();
	}
}
