package Page;

import org.openqa.selenium.By;

public class Page {
	public By username = By.xpath("//input[@id='user-name']");
	public By password = By.xpath("//input[@id='password']");
	public By loginbutton = By.xpath("//input[@id='login-button']");
	
	public By product = By.xpath("//span[@class='title']");
	
	public By backpack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	public By saucelabs = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	public By tshirt = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	public By cart = By.xpath("//a[@class='shopping_cart_link']");
	public By remove =By.xpath("//button[@id='remove-sauce-labs-backpack']");
	public By checkout = By.xpath("//button[@id='checkout']");
	public By firstname = By.xpath("//input[@id='first-name']");
	public By lastname = By.xpath("//input[@id='last-name']");
	public By zipcode = By.xpath("//input[@id='postal-code']");
	public By cont = By.xpath("//input[@id='continue']");
	public By finish = By.xpath("//button[@id='finish']");
	public By thanks = By.xpath("//h2[@class='complete-header']");
	public By backpckprice = By.xpath("//div[@class='inventory_item_price']");
	public By jacketprice = By.xpath("//div[@class='inventory_item_price']");
	public By cartfinal = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	public By checkfinal = By.xpath("//button[@id='checkout']");
	public By summarytotal = By.xpath("//div[@class='summary_total_label']");
	public By value = By.xpath("//span[@class='shopping_cart_badge']");
	public By inventory = By.className("inventory_item");
	public By itemprice = By.className("inventory_item_price");
	public By btninvent = By.className("btn_inventory");
	
}