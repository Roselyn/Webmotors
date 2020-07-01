package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	WebDriver driver;
	
	By txt_campobusca = By.id("searchBar");
	
	By btn_resultado = By.cssSelector(".SearchBar__results__result");
	
	//Constructor
	public MainPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void escreveBusca(String marca, String modelo) {
		
		driver.findElement(txt_campobusca).sendKeys(marca, modelo);
		
	}
	
	public void clicaOpcao() {
		
		driver.findElement(btn_resultado).click();
		
	}

}
