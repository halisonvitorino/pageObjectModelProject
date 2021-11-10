package testes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pageActions.CartActions;
import pageActions.CheckoutInformationActions;
import pageActions.CheckoutOverviewActions;
import pageActions.HomePageActions;
import pageActions.SelectProductActions;
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
		selectProductActions = new SelectProductActions();
		cartActions = new CartActions();
		checkoutInformationActions = new CheckoutInformationActions();
		checkoutOverviewActions = new CheckoutOverviewActions();

		homePageActions.login("standard_user", "secret_sauce");
		selectProductActions.escolherProduto();
		cartActions.irParaCheckout();
		checkoutInformationActions.preencherInformações("halison", "Vitorino", "12345678");
		checkoutInformationActions.continuarCompra();
		checkoutOverviewActions.finalizarCheckout();
	}

	@AfterAll
	static void fecharBrowser() {
		browserAndPageManager.finalizarDriver();
	}
}
