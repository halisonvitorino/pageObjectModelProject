package testes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import actions.CartActions;
import actions.CheckoutInformationActions;
import actions.CheckoutOverviewActions;
import actions.HomePageActions;
import actions.SelectProductActions;
import utils.BrowserAndPageManager;

class TestesJunit {
	
	static WebDriver driver;
	
    static BrowserAndPageManager browserAndPageManager;
    
    static HomePageActions homePageActions;
    static SelectProductActions selectProductActions;
    static CartActions cartActions;
    static CheckoutInformationActions checkoutInformationActions;
    static CheckoutOverviewActions checkoutOverviewActions;
    
	@BeforeAll //roda uma unica vez antes dos testes - utilizo para abrir o chromedriver
	static void configurarDriverJanelaParaTestes() {
		browserAndPageManager.setupChromeDriver();
		browserAndPageManager.iniciarDriver();
		browserAndPageManager.acessarURL();
		browserAndPageManager.maximizarJanela();
		
		homePageActions = new HomePageActions(driver);
		selectProductActions = new SelectProductActions(driver);
		cartActions = new CartActions(driver);
		checkoutInformationActions = new CheckoutInformationActions(driver);
		checkoutOverviewActions = new CheckoutOverviewActions(driver);
	}
	
	@Test
	void realizarCompraComSucesso() {		
		homePageActions.login("standard_user", "secret_sauce");
		selectProductActions.escolherProduto();
		cartActions.irParaCheckout();
		checkoutInformationActions.preencherInformações("halison", "Vitorino", "12345678");
		checkoutOverviewActions.finalizarCheckout();
	}
	

}
















