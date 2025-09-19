package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;

    By txt_username = By.xpath("//input[@id='user-name']");
    By txt_password = By.xpath("//input[@id='password']");
    By btn_login = By.xpath("//input[@id='login-button']");
    By btn_logout = By.xpath("//div[@id='shopping_cart_container']");

    public loginPage(WebDriver driver){
    this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void checkLogOutIsDisplayed(){
        driver.findElement(btn_logout).isDisplayed();
    }
/*
    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys("standard_user");
        driver.findElement(txt_password).sendKeys("secret_sauce");
        driver.findElement(btn_login).click();
    }

 */
}
