package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoPage {
	
	WebDriver driver;
	
	By btn_concessionaria = By.xpath("//div[@id='root']/main/div/div[2]/div/div[5]/div[2]/label");
	
	By btn_loja = By.xpath("//div[@id='root']/main/div/div[2]/div/div[5]/div[3]/label");
	
	By titulo_page = By.cssSelector(".title-search");
	
	By total_carros = By.cssSelector(".FoundCars");
	
	//Constructor
	public ResultadoPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clicaConcessionaria() {
		
		driver.findElement(btn_concessionaria).click();
		
	}
	
	public void clicaLoja() {
		
		driver.findElement(btn_loja).click();
		
	}
	
	public void pegaTotal() {
		
		driver.findElement(total_carros).getText();
		
	}
}
