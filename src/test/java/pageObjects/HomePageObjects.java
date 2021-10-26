package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Menu de acesso ao facebook - identificação dos campos e botoes da pagina //
public class HomePageObjects {	
	
	//Criar webdriver//
	private WebDriver driver;
	
	// Guardar em cache para não ter que buscar mais de uma vez - @CacheLookup//
	@CacheLookup
	@FindBy(id="user-name")
	private WebElement inputUserName;
	
	@CacheLookup
	@FindBy(id="password")
	private WebElement inputPassWord;
	
	@CacheLookup
	@FindBy(id="login-button")
	private WebElement buttonLogin;
	
	
	// Construtor da pagina //	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		
	// Inicializa o Page Factory //		
		PageFactory.initElements(driver, this);
		
	// Inicializa o Page Factory com wait implicito//			
    	//PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}

	// Metodos de acesso aos elementos e encapsulamento de atributos // 	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getInputUserName() {
		return inputUserName;
	}

	public WebElement getInputPassWord() {
		return inputPassWord;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}
}
