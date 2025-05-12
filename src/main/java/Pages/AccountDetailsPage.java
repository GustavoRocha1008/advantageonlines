package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDetailsPage {
    public By FirstName = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='first_nameAccountDetails']");
    public By LastName = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='last_nameAccountDetails']");
    public By PhoneNumber = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='phone_numberAccountDetails']");
    public By City = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='cityAccountDetails']");
    public By Address = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='addressAccountDetails']");
    @FindBy(xpath = "//select[@name='countryListboxAccountDetails']")
    public WebElement Country;
    public By PostaCodel = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='postal_codeAccountDetails']");
    public By Region = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='state_/_province_/_regionAccountDetails']");
    public By BtoSave = By.id("save_btn");
}