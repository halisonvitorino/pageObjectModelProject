package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageObject {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(css="div.cart_quantity")
	private WebElement quantidadeNoCarrinho;

	@CacheLookup
	@FindBy(css="div.inventory_item_name")
	private WebElement nomeProdutoNoCarrinho;
	
	@CacheLookup
	@FindBy(css="div.inventory_item_price")
	private WebElement valorProdutoNoCarrinho;
	
	@CacheLookup
	@FindBy(id="continue-shopping")
	private WebElement butttonContinuarComprando;
	
	@CacheLookup
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement buttonRemoverProduto;
	
	@CacheLookup
	@FindBy(id="checkout")
	private WebElement buttonCheckOut;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getQuantidadeNoCarrinho() {
		return quantidadeNoCarrinho;
	}

	public WebElement getNomeProdutoNoCarrinho() {
		return nomeProdutoNoCarrinho;
	}

	public WebElement getValorProdutoNoCarrinho() {
		return valorProdutoNoCarrinho;
	}

	public WebElement getButttonContinuarComprando() {
		return butttonContinuarComprando;
	}

	public WebElement getButtonRemoverProduto() {
		return buttonRemoverProduto;
	}

	public WebElement getButtonCheckOut() {
		return buttonCheckOut;
	}

	public CartPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
