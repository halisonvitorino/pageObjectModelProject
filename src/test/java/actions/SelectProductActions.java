package actions;

import org.openqa.selenium.WebDriver;

import pageObjects.SelectProductPageObject;

public class SelectProductActions {
	
	static SelectProductPageObject selectProductPageObject;

	public SelectProductActions(WebDriver driver) {		
		selectProductPageObject = new SelectProductPageObject(driver);
	}
	
	public void escolherProduto() {
		selectProductPageObject.getProductSauceLabsBackpackButton().click();
		selectProductPageObject.getCarrinho().click();
	}
}
