package testes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import actions.CartActions;
import actions.CheckoutInformationActions;
import actions.CheckoutOverviewActions;
import actions.HomePageActions;
import actions.SelectProductActions;
import utils.BrowserAndPageManager;

class TestesJunit extends BrowserAndPageManager{

	static BrowserAndPageManager browserAndPageManager;
	public HomePageActions homePageActions;
	public SelectProductActions selectProductActions;
	public CartActions cartActions;
	public CheckoutInformationActions checkoutInformationActions;
	public CheckoutOverviewActions checkoutOverviewActions;

	@BeforeAll
	static void configurarDriverJanelaParaTestes() {
		browserAndPageManager = new BrowserAndPageManager();
		browserAndPageManager.setupChromeDriver();
	}

	@Test
	void realizarCompraComSucesso() {
		
		homePageActions = new HomePageActions();
//		selectProductActions = new SelectProductActions(driver);
//		cartActions = new CartActions(driver);
//		checkoutInformationActions = new CheckoutInformationActions(driver);
//		checkoutOverviewActions = new CheckoutOverviewActions(driver);

		homePageActions.login("standard_user", "secret_sauce");
		selectProductActions.escolherProduto();
		cartActions.irParaCheckout();
		checkoutInformationActions.preencherInformações("halison", "Vitorino", "12345678");
		checkoutOverviewActions.finalizarCheckout();
	}

//	@AfterAll
//	static void fecharBrowser() {
//		browserAndPageManager.finalizarDriver();
//	}
}
